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

Points to Remmember if the Appium server is Opened in PID then we cannot open a new instance of Appium in the same port so use this - >netstat -ano | findstr :4723 to find in which port it is open and then use - taskkill /PID 8772 /F command to close the Job 

Screenshots
![Test Screenshot One](https://github.com/ShubhamSarkarFrost/Appium_Code/blob/master/target/screenshots/Validate_the_Navigation_of_the_Application_is_Correct_or_Not_20240916002339.png)
![Test Screenshots Two](https://github.com/ShubhamSarkarFrost/Appium_Code/blob/master/target/screenshots/Validate_the_Navigation_of_the_Application_is_Correct_or_Not_20240916002341.png)


The Reports are generated through Allure Like
