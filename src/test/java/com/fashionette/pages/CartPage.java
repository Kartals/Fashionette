package com.fashionette.pages;

import com.fashionette.utilities.WebUtils;
import com.fashionette.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath="//a[contains(text(),'eingeben')]")
    public WebElement voucherLink;

    @FindBy(name = "voucherCode")
    public WebElement couponBox;

    @FindBy(xpath ="//button[contains(text(),'eingeben')]")
    public WebElement eingebenButton;

    @FindBy(css = "span[data-code='qachallenge']")
    public WebElement voucherCodePrice;

    @FindBy(css = ".text__right.typography__type-2.cart__subtotal")
    public WebElement zwischensummePrice;

    @FindBy(css = "#cart__total")
    public WebElement rechnungbetragsPrice;

    @FindBy(css = "tr[class='cart__sum__payment__installment-shipping-note'] td")
    public WebElement voucherAppliedText;

    public void useVoucherCode(String code){
        WebUtils.waitFor(3);
        voucherLink.click();
        couponBox.sendKeys(code);
        eingebenButton.click();
    }

    public void voucherSuccessAppliedMessage(){
        WebUtils.waitFor(3);
        Assert.assertTrue(voucherAppliedText.isDisplayed());
    }

    public void voucherProperlyApplied(){
        WebUtils.waitFor(3);
        String zwischensumme=zwischensummePrice.getText();
        String rechnungbetrags=rechnungbetragsPrice.getText();
        String voucherCode=voucherCodePrice.getText();

        int zwischensummePrice = Integer.parseInt(zwischensumme.substring(0,zwischensumme.length()-2));
        int rechnungsbetragsPrice=Integer.parseInt(rechnungbetrags.substring(0,rechnungbetrags.length()-2));
        int voucherPrice=Integer.parseInt(voucherCode.substring(1,voucherCode.length()-2));

        Assert.assertEquals(zwischensummePrice-rechnungsbetragsPrice,voucherPrice);
    }


}
