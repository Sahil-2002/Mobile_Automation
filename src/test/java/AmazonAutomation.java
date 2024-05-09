import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AmazonAutomation {
    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "com.amazon.mShop.android.shopping");
        caps.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");

        // Initialize the AndroidDriver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void searchAndCompareProduct() throws InterruptedException {
        // Skip sign-in
        WebElement skipSignIn = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
        skipSignIn.click();
        Thread.sleep(5000);

        // Perform search
        WebElement searchBox = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view"));
        searchBox.click();
        WebElement search = driver.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
        Thread.sleep(2000);
        search.sendKeys("iPhone");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        // Navigate to a product and compare
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/left_button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("a-autoid-0-announce")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("comparison-lite-trigger-B09VY7RXJ9-announce")).click();
    }

    @Test
    public void signin(){
        driver.findElement(By.id("com.amazon.mShop.android.shopping:id/sign_in_button")).click();
        
    }
}

//{
//        "deviceName": "emulator-5554",
//        "platformName": "Android",
//        "platformVersion": "9.0",
//        "appPackage": "com.amazon.mShop.android.shopping",
//        "appActivity": "com.amazon.mShop.splashscreen.StartupActivity"
//        }