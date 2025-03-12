package Actions;

import Pages.FinishedOrderPage;
import Pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.getUrl;
import static Utils.ClickElements.clickByID;
import static Utils.SendKeys.sendKeysByID;


public class FinishedOrdersActions extends FinishedOrderPage {

    public void confirmOrderFinished() {
        Assert.assertEquals("THANK YOU FOR YOUR ORDER",XPATH_MESSAGE_ORDER_FINISHED);
    }

}
