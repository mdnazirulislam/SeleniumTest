package loginTest;

import base.ScriptBase;
import controller.ContactUs;
import org.testng.annotations.Test;

public class ContactUsTest extends ScriptBase {
    ContactUs contactUs;

    @Test
    public void verifyContactUs() throws InterruptedException {
        contactUs= new ContactUs(driver);
        contactUs.contactUsButton();
    }

}
