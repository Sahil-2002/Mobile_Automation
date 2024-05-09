package MobileAutomation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class owndevice {

    public AndroidDriver driver;

    @BeforeMethod()
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","realme 8");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("appPackage","com.coloros.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        capabilities.setCapability("udid","NRXGSKWGRWSO69KV");
        driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }


    }


//
//{
//        "deviceName": "realme 8",
//        "platformName": "Android",
//        "platformVersion": "13",
//        "appPackage": "com.coloros.calculator",
//        "appActivity": "com.android.calculator2.Calculator"
//
//
//        }