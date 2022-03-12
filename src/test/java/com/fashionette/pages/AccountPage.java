package com.fashionette.pages;

import com.fashionette.utilities.WebUtils;
import com.fashionette.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public AccountPage(){ PageFactory.initElements(Driver.get(), this); }

    //WebDriver driver=Driver.get();

    @FindBy(xpath="//div[@class='account__welcome text__center font-size--hero']")
    public WebElement profileWelcomingText;

    @FindBy(xpath="//a[contains(text(),'Persönliche Daten')]")
    public WebElement personelDataButton;

    @FindBy(xpath="(//div[@class='account--address__action account--address__action--update'])[1]")
    public WebElement editingButton;

    @FindBy(xpath="//input[@placeholder='Vorname']")
    public WebElement nameButton;

    @FindBy(xpath="//input[@placeholder='Nachname']")
    public WebElement surnameButton;

    @FindBy(xpath="//div[contains(text(),'Speichern')]")
    public WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'Liz Shopper Medium Black')]")
    public WebElement clickedItemInCart;

    @FindBy(xpath = "(//div[@class='cart-item--description'])[1]/div[2]")
    public WebElement selectedProduct;



    public void navigatePersonlicheDaten(){
       WebUtils.waitForVisibility(personelDataButton,10);
        personelDataButton.click();
    }

    public void clickBearbeitenButton(){
        WebUtils.waitForVisibility(editingButton,10);
        editingButton.click();
    }

    public void editInfo(String modifiedName, String modifiedSurname){
        nameButton.clear();
        nameButton.sendKeys(modifiedName);
        surnameButton.clear();
        surnameButton.sendKeys(modifiedSurname);
        saveButton.click();

        String expectedFullName=modifiedName+" "+modifiedSurname;
        String actualFullName=Driver.get().findElement(By.xpath("//*[contains(text(),'"+expectedFullName+"')]")).getText();

        String [] totalText=actualFullName.split("\n");
        String [] nameAndSurname=totalText[0].split(" ");
        String actualName=nameAndSurname[1]+" "+nameAndSurname[2];
        Assert.assertEquals(expectedFullName,actualName);

    }


    public void loginWelcomingText(){
        WebUtils.waitForVisibility(profileWelcomingText,10);
        Assert.assertTrue(profileWelcomingText.isEnabled());
    }

    public void selectedCartItem(String expected){
        WebUtils.waitFor(1);
        String actualText=selectedProduct.getText();
        Assert.assertEquals(expected,actualText);
    }



}
