package MobileAutomation;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



import java.net.MalformedURLException;
import java.net.URL;


public class BrowserAutomation {

public AndroidDriver driver;
    @Test
    public void setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("browsername", "chrome");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("chromeOption", ImmutableMap.of("w3c",false));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(3000);
        driver.get("https://www.amazon.com/");
        Thread.sleep(6000);
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Iphone");


    }
}
