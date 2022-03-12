package com.fashionette.stepDef;

import com.fashionette.pages.AccountPage;
import io.cucumber.java.en.*;

public class AccountStepDef {

    AccountPage accountPage =new AccountPage();

    @When("A user navigates to persönliche daten")
    public void a_user_navigates_to_persönliche_daten() {
        accountPage.navigatePersonlicheDaten();
    }

    @When("A user clicks to bearbeiten button")
    public void a_user_clicks_to_bearbeiten_button() {
        accountPage.clickBearbeitenButton();
    }

    @When("A user should be able to change {string} {string}")
    public void a_user_should_be_able_to_change(String name, String username) {
        accountPage.editInfo(name,username);
    }


}
