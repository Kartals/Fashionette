package com.fashionette.stepDef;

import com.fashionette.pages.LoginPage;
import com.fashionette.pages.AccountPage;
import io.cucumber.java.en.*;

public class LoginStepDef {

    LoginPage loginPage=new LoginPage();
    AccountPage accountPage =new AccountPage();

    @Given("A user is on the login page")
    public void a_user_is_on_the_login_page() {
        loginPage.navigateTologinPage();
    }

    @When("A user enters valid credentials")
    public void a_user_enters_valid_credentials() {
        loginPage.login();
    }

    @Then("A user should be able to login")
    public void a_user_should_be_able_to_login() {
        accountPage.loginWelcomingText();
    }

    @When("A user enters with the invalid credentials {string} {string}")
    public void a_user_enters_with_the_invalid_credentials(String username, String password) {
        loginPage.loginWithInvalidCredentials(username, password);
    }

    @Then("get the message {string}")
    public void get_the_message(String expectedInvalidMessage) {
        loginPage.textAfterInvalidCredentials(expectedInvalidMessage);
    }

}
