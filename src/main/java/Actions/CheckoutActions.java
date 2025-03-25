package Actions;

import Pages.CheckoutPage;
import com.github.javafaker.Faker;

import static Utils.ClickElementsUtils.clickByXpath;
import static Utils.SendKeysUtils.sendKeysByID;


public class CheckoutActions extends CheckoutPage {

    Faker faker = new Faker();

    String firstName = faker.name().fullName();
    String lastName = faker.internet().emailAddress();
    String zipCode = faker.address().zipCode();

    public void fillCheckout() {
        sendKeysByID(firstName,ID_INPUT_FIRSTNAME);
        sendKeysByID(lastName, ID_INPUT_LASTNAME);
        sendKeysByID(zipCode ,ID_ZIPCODE);
        clickByXpath(XPATH_BUTTON_CONTINUE);
    }
}
