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

public class Emulator_calculator {
    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Automation started ...");
    }

    @Test(priority = 0)
    public void addition() {
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        WebElement plus = driver.findElement(AppiumBy.accessibilityId("plus"));
        plus.click();
        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();
        WebElement equal = driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
    }

    @Test()
    public void Subtraction() {
        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        six.click();
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

    }

    @Test()
    public void multiplication() {
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_6"));
        six.click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

    }

    @Test()
    public void division() {
        WebElement eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        eight.click();
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();
        driver.findElement(AppiumBy.accessibilityId("divide")).click();
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
        one.click();
        WebElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        seven.click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

    }

}


//{
//        "deviceName": "emulator-5554",
//        "platformName": "Android",
//        "platformVersion": "9.0",
//        "appPackage": "com.android.calculator2",
//        "appActivity": "com.android.calculator2.Calculator"
//        }