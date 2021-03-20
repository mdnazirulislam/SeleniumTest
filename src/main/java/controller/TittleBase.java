package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TittleBase {
    @Test
    public void init10() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedrive");
        WebDriver driver;
        driver= new ChromeDriver();
        //Thread.sleep(millis: 4000);
        String ExpectedTitle = "My Store";
        String Actualtitle = "";
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       // driver.manage().timeouts().pageLoadTimeout( time:20, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(time:20, TimeUnit.SECONDS);
        Actualtitle = driver.getTitle();
        if(Actualtitle.contentEquals(ExpectedTitle)) {
            System.out.println("Test case passed>>>>>>>>>");
        }else {
            System.out.println("Test case Failed.........");
        }

    }
}
