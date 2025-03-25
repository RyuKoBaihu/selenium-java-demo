package Actions;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.*;
import static StepDefinitions.GeneralSteps.UserProperties.getPassword;
import static StepDefinitions.GeneralSteps.UserProperties.getUsername;
import static Utils.ClickElementsUtils.clickByID;
import static Utils.SendKeysUtils.sendKeysByID;


public class LoginPageActions extends LoginPage {

    WebDriver driver = getDriver();
    String URL = getUrl();
    String USERNAME = getUsername();
    String PASSWORD = getPassword();

    public void accessLoginPage() {
        driver.get(URL);
        System.out.println("URL: " + URL);
        sendKeysByID(USERNAME,ID_INPUT_USERNAME);
        sendKeysByID(PASSWORD,ID_INPUT_PASSWORD);
        clickByID(ID_BUTTON_SUBMIT);
    }




}
