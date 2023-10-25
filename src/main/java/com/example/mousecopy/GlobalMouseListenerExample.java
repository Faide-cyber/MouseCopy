package com.example.mousecopy;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;
import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GlobalMouseListenerExample implements NativeMouseInputListener {
    private boolean isDropped = false;
    private final Robot robot;

    public void nativeMouseDragged(NativeMouseEvent e) {
        isDropped = true;
    }

    public GlobalMouseListenerExample() throws AWTException {
        this.robot = new Robot();
    }

    public void nativeMouseReleased(NativeMouseEvent e) {
        if (e.getButton() == 1 && isDropped) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);
            robot.delay(50);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(50);
            robot.keyRelease(KeyEvent.VK_C);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(50);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            isDropped = false;
        } else if (e.getButton() == 4 || e.getButton() == 5) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(50);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(50);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            isDropped = false;
        }
    }


    public static void main(String[] args) throws AWTException {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println(ex.getMessage());
            System.exit(1);
        }

        // Construct the example object.
        GlobalMouseListenerExample example = new GlobalMouseListenerExample();
        // Add the appropriate listeners.
        GlobalScreen.addNativeMouseListener(example);
        GlobalScreen.addNativeMouseMotionListener(example);
    }

    public void handleGithubAction(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/Faide-cyber/MouseCopy"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}