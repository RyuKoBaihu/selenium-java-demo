package Actions;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.getUrl;
import static Utils.ClickElements.clickByID;
import static Utils.SendKeys.sendKeysByID;


public class LoginPageActions extends LoginPage {

    public final static String USERNAME = "standard_user";
    public final static String PASSWORD = "secret_sauce";

    WebDriver driver = getDriver();
    String url = getUrl();

    public void accessLoginPage() {
        driver.get(url);
        System.out.println("A URL obtida é: " + url);
        sendKeysByID(USERNAME,ID_INPUT_USERNAME);
        sendKeysByID(PASSWORD,ID_INPUT_PASSWORD);
        clickByID(ID_BUTTON_SUBMIT);
    }




}
