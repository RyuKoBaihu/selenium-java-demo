package Actions;

import Pages.CheckoutOverviewPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.getUrl;
import static Utils.ClickElements.clickByID;
import static Utils.ClickElements.clickByXpath;
import static Utils.SendKeys.sendKeysByID;


public class CheckoutOverviewActions extends CheckoutOverviewPage {

    public void checkoutOverview() {
        clickByXpath(XPATH_BUTTON_FINISH);
    }

}
