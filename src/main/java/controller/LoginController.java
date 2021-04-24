package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginController {
    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signInButton;
    @FindBy(id = "email") WebElement inputEmail;
    @FindBy(id = "passwd") WebElement inputPass;

    public LoginController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void setSignInButtonDisplay(){
        signInButton.isDisplayed();
    }

    public void validLoginInput(){
        signInButton.click();
        inputEmail.sendKeys("test@gmail.com");
        inputPass.sendKeys("Admin123");
    }
}
