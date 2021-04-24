package loginTest;

import base.ScriptBase;
import controller.LoginController;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase {
    LoginController loginController;

    @Test
    public void openBrowserWithChrome(){
        init();


    }
    @Test
    public void verifySignInButtonDisplayed(){
        loginController=new LoginController(driver);
        loginController.setSignInButtonDisplay();

    }
    @Test
    public void verifyValidLogIn(){
        loginController=new LoginController(driver);
        loginController.validLoginInput();
    }
}
