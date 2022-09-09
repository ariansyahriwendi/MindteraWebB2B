package TestStep;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordStep extends BaseStep {

    @When("I want to use forgot password")
    public void IWantToUseForgotPassword() {

    }

    @And("I click forgot password")
    public void IClickForgotPassword() throws InterruptedException {
        Thread.sleep(3000);
        forgotPassword.clickButtonForgotPassword();
    }

    @And("I input email forgot password {string}")
    public void IInputEmailForgotPassword(String email) throws InterruptedException {
        Thread.sleep(2000);
        forgotPassword.inputFieldEmailForgotPassword(email);
    }

    @And("I click send forgot password")
    public void IClickSendForgotPassword() {
        forgotPassword.clickButtonSendForgotPassword();
    }

    @Then("I use forgot password successfully")
    public void IUseForgotPasswordSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        BaseSetUp.quitWebsite();
    }

}
