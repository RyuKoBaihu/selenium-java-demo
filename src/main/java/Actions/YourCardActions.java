package Actions;

import Pages.LoginPage;
import Pages.YourCarPage;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.getUrl;
import static Utils.ClickElements.clickByID;
import static Utils.ClickElements.clickByXpath;
import static Utils.SendKeys.sendKeysByID;


public class YourCardActions extends YourCarPage {

    public void checkoutYourCart() {
        clickByXpath(XPATH_BUTTON_CHECKOUT);
    }

}
