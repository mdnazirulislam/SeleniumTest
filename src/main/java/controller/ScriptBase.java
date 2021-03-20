package controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ScriptBase {
    public WebDriver driver;


    @Test
    public void chromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");


    }

    @Test
    public void safaribrowser() throws InterruptedException {

        System.setProperty("webdriver.safari.noinstall","true");
        Thread.sleep(5000);
        driver = new SafariDriver();
        driver.get("http://automationpractice.com/index.php");

    }

    @Test
    public void firebrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
        Thread.sleep(5000);
        driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");


    }
    @Test
    public void firebrowser2() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
        Thread.sleep(5000);
        driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");


    }

    @Test
    public void chromeBrowsertwo()throws InterruptedException {
        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");

    }


}