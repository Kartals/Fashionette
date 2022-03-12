package com.fashionette.stepDef;

import com.fashionette.pages.HomePage;
import com.fashionette.pages.LoginPage;
import com.fashionette.pages.AccountPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CartStepDef {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    AccountPage accountPage =new AccountPage();

    @Given("A user is on the Fashionette webpage")
    public void a_user_is_on_the_Fashionette_webpage() {
        loginPage.LandingPageFashionette();
    }

    @When("A user searchs {string} on the search box")
    public void a_user_searchs_on_the_search_box(String product) {homePage.productSearch(product);}

    @When("A user clicks on that product")
    public void a_user_clicks_on_that_product() {
        homePage.clickedToSearchedProduct();
    }

    @When("A user adds the {string} to the cart")
    public void a_user_adds_the_to_the_cart(String product) {
        homePage.clickedInDenWarenkorb();
    }

    @When("A user navigates to the cart")
    public void a_user_navigates_to_the_cart() {
        homePage.navigateToCartItem();
    }

    @Then("The selected {string} should be in the cart")
    public void the_selected_should_be_in_the_cart(String expectedProduct) {
        accountPage.selectedCartItem(expectedProduct);
    }


}
