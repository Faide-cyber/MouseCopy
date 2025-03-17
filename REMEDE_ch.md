# MouseCopy: 用鼠标取代传统的Ctrl+C,Ctrl+V

#### [English Doc](https://github.com/Faide-cyber/MouseCopy/blob/main/README.md)

![Static Badge](https://img.shields.io/badge/%40Github-Faide-%2300FFFF) ![Static Badge](https://img.shields.io/badge/Language-Java-%2325c2a0)![Static Badge](https://img.shields.io/badge/PlatForm-Windows-%238c37dc) ![Static Badge](https://img.shields.io/badge/Version-1.0.0-%23e87435) ![Static Badge](https://img.shields.io/badge/License-GNU3.0-%2314bbc1)

## 关于

Java 领域的 GUI 技术（如 Java Swing、JavaFX 等）可以实现快捷键的功能。但是，使用这种方法实现的快捷键有一个致命的缺陷，那就是如果光标焦点离开UI 界面，则所有的快捷键都将失效。而对于鼠标全局监听来说,对于Java提供的简单易用的接口少之又少。JNI(Java Native Interface)是Java语言本身提供的调用本地已编译的函数库的方法,但是调用.dll/.so共享类库是非常非常麻烦的。JNA（Java Native Access）省去了对c/c++程序的再封装,但是存在跨语言调用的难点。JNativeHook是一个为Java提供全局键盘和鼠标侦听器的库,使用了JNI 技术调用了系统的方法来实现该功能,对Java更为友好。

## 安装

1. 下载 MouseCopy 的安装文件。您可以在项目的存储库中找到安装文件。请注意，如果您只需要运行程序，只需下载 "install" 文件夹直接打开exe文件即可。如果您需要进行部署或开发，您可能需要下载除了 "install" 文件夹之外的其他文件。
2. 解压缩下载的安装文件。将解压后的文件保存在您选择的位置。
3. 进入解压后的文件夹，找到 "install" 文件夹。
4. 如果您只需要运行程序，双击运行 "MouseCopy.exe" 文件即可启动 MouseCopy。
5. 如果您需要进行部署或开发，请下载除install文件夹的其他文件,推荐使用javapackager进行打包。

如果您在安装过程中遇到任何问题，请随时提交 issue 或寻求相关的技术支持。

## 功能特点

MouseCopy 提供以下功能特点： 

- 使用鼠标进行复制：通过鼠标选中文本，即可自动复制到剪贴板中。 
- 使用侧键进行粘贴：通过鼠标侧键单击，即可将剪贴板中的内容粘贴到目标位置。
- 全局监听鼠标事件：MouseCopy 使用 JNativeHook 库实现全局鼠标事件监听，以捕捉鼠标拖动和侧键单击事件。 
- MouseCopy利用JNI的API和Jnativehook库，实现了用鼠标取代传统的Ctrl+C和Ctrl+V的功能。通过使用MouseCopy，用户可以更方便地复制和粘贴文本，而无需依赖键盘快捷键。

## 系统要求

MouseCopy 需要满足以下系统要求才能正常运行：

- Java 1.8 - 17
- 128 MB 的内存
- Windows 2000 - 11
  - 支持的架构：i586、amd64、arm7

请确保您的系统满足以上要求，以确保 MouseCopy 能够正常运行。

## 许可

MouseCopy是免费软件：您可以根据自由软件基金会发布的GNU通用公共许可证的条款进行再分发和/或修改。您可以选择使用第3版许可证，或者任何更高版本的许可证。

本程序是以希望它会有用的方式发布，但不提供任何明示或暗示的保证，包括但不限于适销性或特定用途的适用性。请参阅GNU通用公共许可证以获取更多详细信息。

您应该已经随此程序收到了GNU通用公共许可证的副本。如果没有，请参阅http://www.gnu.org/licenses/。

## 免责声明

MouseCopy（以下简称“本项目”）仅供学习和研究使用，禁止将其用于任何非法用途。如果您选择使用本项目的任何部分，您必须遵守所有相关法律和规定，并承担由此产生的所有责任。

作者不对因使用本项目而导致的任何损失或损害负责。如果您选择使用本项目的任何部分，您应该自己承担所有风险和责任。

本人保留追究任何非法使用本项目的人的法律责任的权利。如果您选择使用本项目的任何部分进行非法活动，您将面临法律诉讼和其他惩罚。

使用者应遵守相关法律法规，尊重作者的知识产权。任何因违反上述规定而引起的法律纠纷，由使用者承担全部责任。

本声明的解释权归作者所有。

## 附加信息

最新的源代码和文档可在以下网址获得： https://github.com/Faide-cyber/MouseCopy

## 联系方式

微信或邮箱1350038426@qq.com

如果您有任何问题或疑问，也可以通过提交issue的方式与我进行交流。

在提交issue时，请确保描述清楚您的问题或反馈，并提供足够的上下文信息，以便我能够更好地理解和回答您的问题。

![QQ图片202310251908231](https://github.com/Faide-cyber/MouseCopy/assets/148406475/8b7ac122-d438-4d64-b6d0-330b514e4389)

