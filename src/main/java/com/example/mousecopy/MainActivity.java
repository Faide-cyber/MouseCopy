package com.example.mousecopy;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
public class MainActivity extends Application {
    private static final String ICON_PATH = "/icon.png";
    private SystemTray systemTray;
    private TrayIcon trayIcon;
    private Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainActivity.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("MouseCopy");
        stage.getIcons().add(new Image("/icon.png"));
        stage.setScene(scene);
        stage.setOnCloseRequest(e -> {
            e.consume();
            exitApplication();
        });
        stage.show();

        try {
            GlobalScreen.registerNativeHook();
            // Construct the example object.
            GlobalMouseListenerExample example = new GlobalMouseListenerExample();
            // Add the appropriate listeners.
            GlobalScreen.addNativeMouseListener(example);
            GlobalScreen.addNativeMouseMotionListener(example);
        } catch (NativeHookException | AWTException ex) {
            System.err.println(ex.getMessage());
            System.exit(1);
        }


        stage.iconifiedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                try {
                    systemTray = SystemTray.getSystemTray();
                    trayIconRemove();
                    trayIcon = new TrayIcon(ImageIO.read(getResourceAsURL(ICON_PATH)), "MouseCopy");
                    trayIcon.setImageAutoSize(true);
                    trayIcon.addActionListener(e -> Platform.runLater(this::showStage));

                    PopupMenu popupMenu = new PopupMenu();
                    MenuItem openItem = new MenuItem("Open");
                    openItem.addActionListener(e -> {
                        Platform.runLater(() -> {
                            if (stage.isIconified()) {
                                stage.setIconified(false);
                                stage.toFront();
                            }
                        });
                    });
                    popupMenu.add(openItem);

                    MenuItem exitItem = new MenuItem("Exit");
                    exitItem.addActionListener(e -> Platform.runLater(this::exitApplication));
                    popupMenu.add(exitItem);

                    trayIcon.setPopupMenu(popupMenu);
                    trayIcon.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            if (e.getButton()==1){
                                Platform.runLater(() -> {
                                    if (stage.isIconified()) {
                                        stage.setIconified(false);
                                        stage.toFront();
                                        trayIconRemove();
                                    }
                                });
                            }
                        }
                    });
                    systemTray.add(trayIcon);
                } catch (IOException | AWTException e) {
                    e.printStackTrace();
                }
                stage.hide();
                Platform.setImplicitExit(false);
            } else {
                stage.show();
                stage.toFront();
                trayIconRemove();
            }
        });
    }


    private void showStage() {
        if (stage != null) {
            stage.show();
            stage.toFront();
        }
    }

    private URL getResourceAsURL(String resourcePath) {
        return getClass().getResource(resourcePath);
    }

    private void trayIconRemove() {
        if (trayIcon != null) {
            systemTray.remove(trayIcon);
        }
    }

    private void exitApplication() {
        if (trayIcon != null) {
            systemTray.remove(trayIcon);
        }
        try {
            Robot robot = new Robot();
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch();
    }
}
