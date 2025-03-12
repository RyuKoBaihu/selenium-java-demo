package StepDefinitions.BuyItemSteps;


import Actions.LoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class buyItemSteps {

        LoginPageActions loginPageActions = new LoginPageActions();

        @Given("that I am logged")
        public void iAmLogged() {
          loginPageActions.accessLoginPage();
        }

        @When("I buy an item")
        public void iBuyAnItem() {

        }

        @Then("I check if the order was finished")
        public void iCheckIfTheOrderWasFinished() {

        }

}

