# MouseCopy: Replace Traditional Ctrl+C, Ctrl+V with Mouse

#### [简体中文文档](https://github.com/Faide-cyber/MouseCopy/blob/main/README_en.md)

![Static Badge](https://img.shields.io/badge/%40Github-Faide-%2300FFFF) ![Static Badge](https://img.shields.io/badge/Language-Java-%2325c2a0) ![Static Badge](https://img.shields.io/badge/PlatForm-Windows-%238c37dc) ![Static Badge](https://img.shields.io/badge/Version-1.0.0-%23e87435) ![Static Badge](https://img.shields.io/badge/License-GNU3.0-%2314bbc1)


## About

GUI technologies in the Java field (such as Java Swing, JavaFX, etc.) can implement keyboard shortcuts. However, a fatal flaw of using this method to implement keyboard shortcuts is that if the cursor focus leaves the UI interface, all keyboard shortcuts will become ineffective. As for global mouse listening in Java, there are very few simple and easy-to-use interfaces provided by Java. JNI (Java Native Interface) is a method provided by the Java language itself to call locally compiled function libraries, but calling shared class libraries such as .dll/.so is very troublesome. JNA (Java Native Access) eliminates the need for repackaging C/C++ programs, but there are difficulties in cross-language calls. JNativeHook is a library that provides global keyboard and mouse listeners for Java, using JNI technology to call system methods to achieve this functionality, making it more friendly to Java.

## Installation

1. Download the installation files for MouseCopy. You can find the installation files in the project repository. Please note that if you only need to run the program, you can directly open the "install" folder and run the exe file. If you need to deploy or develop, you may need to download additional files besides the "install" folder.
2. Extract the downloaded installation files. Save the extracted files in the location of your choice.
3. Navigate to the extracted folder and locate the "install" folder.
4. If you only need to run the program, double-click on the "MouseCopy.exe" file to launch MouseCopy.
5. If you need to deploy or develop, please download additional files besides the "install" folder. It is recommended to use javapackager for packaging.

If you encounter any issues during the installation process, feel free to submit an issue or seek relevant technical support.

## Features

MouseCopy provides the following features:

- Copy text using the mouse: Select text with the mouse to automatically copy it to the clipboard.
- Paste using the side button: Click the side button on the mouse to paste the content from the clipboard to the target location.
- Globally listen to mouse events: MouseCopy uses the JNativeHook library to implement global mouse event listening, capturing mouse drag and side button click events.
- MouseCopy utilizes JNI API and Jnativehook library to replace traditional Ctrl+C and Ctrl+V functions with mouse operations. By using MouseCopy, users can copy and paste text more conveniently without relying on keyboard shortcuts.

## System Requirements

To ensure proper functioning of MouseCopy, your system must meet the following requirements:

- Java 1.8 - 17
- 128 MB of memory
- Windows 2000 - 11
  - Supported architectures: i586, amd64, arm7

Please ensure that your system meets these requirements to ensure that MouseCopy can run properly.

## License

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

## Disclaimer

The MouseCopy(hereinafter referred to as "this project") is for learning and research purposes only, and it is prohibited to use it for any illegal purposes. If you choose to use any part of this project, you must comply with all relevant laws and regulations and bear all responsibilities arising therefrom.

The author is not responsible for any losses or damages caused by the use of this project. If you choose to use any part of this project, you should assume all risks and responsibilities yourself.

I reserve the right to pursue legal liability for anyone who uses this project in an illegal manner. If you choose to use any part of this project for illegal activities, you will face legal action and other penalties.

Users should comply with relevant laws and regulations and respect the intellectual property rights of the author. Any legal disputes arising from violations of the above provisions shall be borne by the user.

The interpretation of this statement belongs to the author.

## Additional Information

The latest source code and documentation can be obtained at the following URL: https://github.com/Faide-cyber/MouseCopy/

## Contact Information

WeChat or Email: 1350038426@qq.com

If you have any questions or concerns, you can also communicate with me by submitting an issue.

When submitting an issue, please make sure to describe your problem or feedback clearly and provide enough context information so that I can better understand and answer your question.

![QQ图片202310251908231](https://github.com/Faide-cyber/MouseCopy/assets/148406475/8b7ac122-d438-4d64-b6d0-330b514e4389)

