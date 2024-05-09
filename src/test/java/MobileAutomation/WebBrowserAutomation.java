package MobileAutomation;



import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;


public class WebBrowserAutomation {
    public AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Automation started ...");

    driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("com.android.chrome:id/positive_button")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("com.android.chrome:id/signin_sync_description")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("com.android.chrome:id/positive_button")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("com.android.chrome:id/search_box_text")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@content-desc=\"New tab\"]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
    Thread.sleep(5000);
}

@Test
public void checkchrome() throws AWTException, InterruptedException {
        driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("www.amazon.com");
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    driver.findElement(By.id("intlDeals")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
            "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget." +
            "FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View")).sendKeys("Iphone");
    Thread.sleep(3000);
    driver.findElement(By.id("nav-button-avatar")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("ap_email_login")).sendKeys("9082164605");
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[2]" +
            "/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View/android.widget.Button")).click();
    }
    @Test
    public void wiki() throws AWTException {
     driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@content-desc=\"New tab\"]/android.widget.LinearLayout[1]/" +
             "android.widget.FrameLayout[2]/android.widget.FrameLayout[4]/android.widget.ImageView")).click();
     Robot r = new Robot();
    r.mouseWheel(500);

    }
    @Test
    public void img() throws AWTException {
        driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("flowers");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(AppiumBy.accessibilityId("More options")).click();
        driver.findElement(AppiumBy.accessibilityId("History")).click();

    }


}







//{
//        "deviceName": "emulator-5554",
//        "platformName": "Android",
//        "platformVersion": "9.0",
//        "appPackage": "com.android.chrome",
//        "appActivity": "com.google.android.apps.chrome.Main"
//        }


/* Accept & continue id : com.android.chrome:id/terms_accept
* Continue  id : com.android.chrome:id/positive_button
* chrome sync  id : com.android.chrome:id/signin_sync_description
* ok got it   id : com.android.chrome:id/positive_button
* search bar  id : com.android.chrome:id/search_box_text
* amazon icon xpath : //android.support.v7.widget.RecyclerView[@content-desc="New tab"]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.ImageView
*
*
*
*
*
*
*
* */