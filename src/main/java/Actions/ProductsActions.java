package Actions;

import Pages.ProductsPage;
import static Utils.ClickElementsUtils.clickByID;
import static Utils.ClickElementsUtils.clickByXpath;


public class ProductsActions extends ProductsPage {

    public void addBackpackToCard() {
        clickByXpath(XPATH_BUTTON_ADD_TO_CARD_BACKPACK);
    }

    public void addToCart() {
        clickByID(ID_BUTTON_SHOPPING_CART);
    }


}
