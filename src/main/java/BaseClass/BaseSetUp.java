package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseSetUp {
    public static WebDriver driver;
    private static final Properties properties = new Properties();


    public static void getDriver() throws IOException {
        InputStream input = new FileInputStream("properties/browser.properties");
        properties.load(input);
        System.setProperty(properties.getProperty("DRIVER_NAME"), properties.getProperty("Chrome_DRIVER_PATH"));
        driver = new ChromeDriver();
    }

    public static String getUrl() {
        return properties.getProperty("WEB_URL");
    }

    public static void openWebsite(String websiteUrl) {
        driver.navigate().to(websiteUrl);
    }

    public static void quitWebsite() {
        driver.quit();
    }

    public static void maximizeWebsite() {
        driver.manage().window().maximize();
    }

    public static void clickButton(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    public static void inputText(By by, String text) {
        WebElement element = driver.findElement(by);
        element.sendKeys(text);
    }

    public static void getLocation(By by) {
        WebElement element = driver.findElement(by);
        element.getLocation();
    }

    public static void isDisplayed(By by) {
        WebElement element = driver.findElement(by);
        element.isEnabled();
    }

}

/*
1. input text
2. click
4. scroll down
5. scroll up
6. switch to frame
7. swipe right
8. swipe left
9. waitUntilElementIsVisible
10. waitUntilElementIsInvisible
11. waitUntilElementIsClickAble

 */
