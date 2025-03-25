package Actions;

import Pages.CheckoutOverviewPage;

import static Utils.ClickElementsUtils.clickByXpath;


public class CheckoutOverviewActions extends CheckoutOverviewPage {

    public void checkoutOverview() {
        clickByXpath(XPATH_BUTTON_FINISH);
    }

}
