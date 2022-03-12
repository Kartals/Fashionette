package com.fashionette.stepDef;

import com.fashionette.pages.CartPage;
import io.cucumber.java.en.*;

public class VoucherStepDef {

    CartPage cartPage=new CartPage();

    @When("A user applies the voucher {string} to the cart")
    public void aUserAppliesTheVoucherToTheCart(String voucher) {
        cartPage.useVoucherCode(voucher);
    }

    @Then("A user sees that voucher code successfully applied message")
    public void aUserSeesThatVoucherCodeSuccessfullyAppliedMessage() {
        cartPage.voucherSuccessAppliedMessage();
    }

    @Then("the voucher is properly applied")
    public void theVoucherIsProperlyApplied() {
        cartPage.voucherProperlyApplied();
    }
}
