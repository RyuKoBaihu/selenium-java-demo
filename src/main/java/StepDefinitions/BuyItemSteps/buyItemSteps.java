package StepDefinitions.BuyItemSteps;


import Actions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buyItemSteps {

        LoginPageActions loginPageActions = new LoginPageActions();
        ProductsActions productsActions = new ProductsActions();
        YourCartActions yourCartActions = new YourCartActions();
        CheckoutActions checkoutActions = new CheckoutActions();
        CheckoutOverviewActions checkoutOverviewActions = new CheckoutOverviewActions();
        FinishedOrdersActions finishedOrdersActions = new FinishedOrdersActions();

        @Given("that I am logged")
        public void iAmLogged() {
          loginPageActions.accessLoginPage();
        }

        @When("I buy an item")
        public void iBuyAnItem() {
          productsActions.addBackpackToCard();
          productsActions.addToCart();
          yourCartActions.checkoutYourCart();
          checkoutActions.fillCheckout();
          checkoutOverviewActions.checkoutOverview();
        }

        @Then("I check if the order was finished")
        public void iCheckIfTheOrderWasFinished() {
            finishedOrdersActions.confirmOrderFinished();
        }

}

