package Actions;

import Pages.YourCartPage;

import static Utils.ClickElementsUtils.clickByXpath;


public class YourCartActions extends YourCartPage {

    public void checkoutYourCart() {
        clickByXpath(XPATH_BUTTON_CHECKOUT);
    }

}
