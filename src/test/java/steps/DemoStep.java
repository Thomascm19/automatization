package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoPage;

public class DemoStep {
    DemoPage demoPage = new DemoPage();

    @Given("^the user navigates to https://www.demoblaze.com/index.html$")
    public void navigateToDemo(){

        demoPage.navigateToDemo();
    }

    @When("^the user enter your (.+) and (.+)$")
    public void enterCredentials(String user, String pass){
        demoPage.enterUser(user);
        demoPage.enterPassword(pass);
    }

    @And("click in the Sig in button and see de home page")
    public void enterToDemo(){

        demoPage.clickSigInButton();
    }

    @Then("the user close session correctly")
    public void closeSessionDemo(){
        demoPage.closeSession();
    }
}
