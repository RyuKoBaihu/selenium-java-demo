package Actions;

import Pages.CheckoutPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.getUrl;
import static Utils.ClickElements.clickByID;
import static Utils.ClickElements.clickByXpath;
import static Utils.SendKeys.sendKeysByID;


public class CheckoutActions extends CheckoutPage {

    String firstName = "First Name";
    String lastName = "Last Name";
    String zipCode = "Zipcode";

    public void fillCheckout() {
        sendKeysByID(firstName,ID_INPUT_FIRSTNAME);
        sendKeysByID(lastName, ID_INPUT_LASTNAME);
        sendKeysByID(zipCode ,ID_ZIPCODE);
        clickByXpath(XPATH_BUTTON_CONTINUE);
    }

}
