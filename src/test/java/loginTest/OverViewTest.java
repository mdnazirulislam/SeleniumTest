package loginTest;

import base.ScriptBase;
import controller.OverViewPageController;
import org.testng.annotations.Test;

public class OverViewTest extends ScriptBase {
    OverViewPageController overViewPageController;

    @Test
    public void verifyOverViewSpecials() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "Specials");
    }

    @Test
    public void verifyOverViewNewProducts() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "New products");
    }


    @Test
    public void verifyOverViewBestsellers() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "Best sellers");
    }

    @Test
    public void verifyOverViewOurStores() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "Our stores");
    }

    @Test
    public void verifyOverViewContactus() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "Contact us");
    }

    @Test
    public void verifyOverViewTermsandconditionofuse() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "Terms and conditions of use");
    }

    @Test
    public void verifyOverViewAboutus() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "About us");
    }

    @Test
    public void verifyOverViewSitemap() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "Sitemap");
    }

    @Test
    public void verifyOverViewMyorders() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "My orders");
    }

    @Test
    public void verifyOverViewMycreditslips() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "My credit slips");
    }

    @Test
    public void verifyOverViewMyaddresses() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "My addresses");
    }

    @Test
    public void verifyOverViewMypersonalinfo() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "My personal info");
    }

    @Test
    public void verifyOverViewWomen() {
        overViewPageController = new OverViewPageController(driver);
        overViewPageController.overviewPageInfo(driver, "Women");
    }
}
