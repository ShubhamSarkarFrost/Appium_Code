# Appium_Code
This is my way of creation of Test Suite with Appium 2.0(Windows 11)

Installation 
Android 
Set the Following Environemnt Variable 
1- C:\Users\frost\AppData\Local\Android\Sdk  - Android Home 
2- C:\Program Files\Java\jdk-11 - Java Home 
3- C:\Program Files\apache-maven-3.8.8 - Maven Home 
4- C:\Program Files\nodejs - Node Js

Set Path Variable 
1-%ANDROID_HOME%\tools
2-%ANDROID_HOME%\platform-tools
3-%ANDROID_HOME%\emulator

Appium Installation 
command - npm install -g appium@latest

to start Appium Server Type- appium 
Download the UiAutomator2 driver

Setup the SDK - Android API 35
Setup the emulator - Pixel 4 download 

to start the Emulator=  emulator -avd DEVICE_NAME  ; eg = emulator -avd TestAndroidDevice 

To get the appActivity and appPackage use = adb shell dumpsys window | findstr "mCurrentFocus"

set the Following in appium inspector
{
  "appium:appPackage": "io.appium.android.apis",
  "appium:appActivity": "io.appium.android.apis.ApiDemos",
  "appium:deviceName": "TestAndroidDevice",
  "appium:automationName": "UiAutomator2",
  "platformName": "Android",
  "appium:noReset": "true"
}












