package TestStep;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class LoginStep extends BaseStep {

    @Given("I am user")
    public void iAmUser() throws IOException {
        BaseSetUp.getDriver();
        BaseSetUp.openWebsite(BaseSetUp.getUrl());
        BaseSetUp.maximizeWebsite();
    }

    @When("I want to login")
    public void IWantToLogin() {
    }

    @And("I input email {string}")
    public void IInputEmail(String email) throws InterruptedException {
        Thread.sleep(3000);
        login.inputEmailIsDisplayed();
        login.inputEmail(email);
    }

    @And("I input password {string}")
    public void IInputPassword(String password) {
        login.inputPassword(password);
    }

    @And("I click login")
    public void IClickLogin() {
        login.clickButtonLogin();
    }


    @Then("I login successfully")
    public void ILoginSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        BaseSetUp.quitWebsite();
        Thread.sleep(3000);
    }

    @And("I click logout")
    public void IClickLogout() throws InterruptedException {
        Thread.sleep(5000);
        login.getLocationButtonLogout();
        login.clickButtonLogout();
    }

    @And("I click confirm logout")
    public void IClickConfirmLogout() {
        login.clickButtonConfirmLogout();
    }

    @Then("I logout successfully")
    public void ILogoutSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        BaseSetUp.quitWebsite();
    }

}
