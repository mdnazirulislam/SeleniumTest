package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OverViewPageController {

    public OverViewPageController(WebDriver driver){

        PageFactory.initElements(driver,  this);}

    public void overviewPageInfo(WebDriver driver, String information ){
        driver.findElement(By.xpath("//a[contains(text(),'"+information+"')]")).isDisplayed();
        }
    }

