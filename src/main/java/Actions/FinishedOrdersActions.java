package Actions;

import Pages.FinishedOrderPage;
import static Utils.AssertsUtils.AssertEqualsXpath;

public class FinishedOrdersActions extends FinishedOrderPage {

    public void confirmOrderFinished() {
        AssertEqualsXpath("THANK YOU FOR YOUR ORDER",XPATH_MESSAGE_ORDER_FINISHED);
    }

}
