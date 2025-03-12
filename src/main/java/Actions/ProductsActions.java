package Actions;

import Pages.LoginPage;
import Pages.ProductsPage;
import org.openqa.selenium.WebDriver;

import static BrowserFactory.DriverFactory.getDriver;
import static StepDefinitions.GeneralSteps.ApplicationProperties.getUrl;
import static Utils.ClickElements.clickByID;
import static Utils.ClickElements.clickByXpath;
import static Utils.SendKeys.sendKeysByID;


public class ProductsActions extends ProductsPage {

    public void addBackpackToCard() {
        clickByXpath(XPATH_BUTTON_ADD_TO_CARD_BACKPACK);
    }

    public void addToCart() {
        clickByID(ID_BUTTON_SHOPPING_CART);
    }


}
