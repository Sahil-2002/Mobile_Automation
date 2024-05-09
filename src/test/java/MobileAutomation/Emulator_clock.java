package MobileAutomation;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Emulator_clock {

    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("emulator-5554", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "com.google.android.deskclock");
        capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Automation started ... ");


    }

    @Test
    public void stopwatch() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[4]/android.widget.TextView")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")).click();

    }

    @Test
    public void alarm() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]/android.widget.TextView")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"8:30 AM Alarm\"]/android.widget.Switch")).click();
    }


}
//{
//        "deviceName": "emulator-5554",
//        "emulator-5554": "Android",
//        "platformVersion": "9.0",
//        "appPackage": "com.google.android.deskclock",
//        "appActivity": "com.android.deskclock.DeskClock"
//        }