package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInTest {
    @Test
    public void init(){
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
WebDriver driver= new ChromeDriver();
        driver.get("http://automationprfactice.com.index.php");
    }
    



}
