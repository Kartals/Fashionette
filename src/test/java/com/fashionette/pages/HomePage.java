package com.fashionette.pages;

import com.fashionette.utilities.WebUtils;
import com.fashionette.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//*[@data-id='user login']")
    public WebElement loginButton;

    @FindBy(xpath="//span[contains(text(),'Wonach suchst Du?')]")
    public WebElement clickSearchBox;

    @FindBy(xpath="//input[@name='q']")
    public WebElement writingInSearchBox;

    @FindBy(xpath="//div[@class='product--list__item__image']")
    public WebElement productSearched;

    @FindBy(xpath="//div[@class='btn btn--bigger-icon preventspinner btn-default']")
    public WebElement buttonInDenWarenkorb;

    @FindBy(xpath="//a[@class='header__cart-icon']")
    public WebElement cartIcon;


    public void productSearch(String searchedProduct){
        WebUtils.clickWithJS(clickSearchBox);
        //clickSearchBox.click();
        writingInSearchBox.sendKeys(searchedProduct);
    }

    public void clickedToSearchedProduct(){
        WebUtils.clickWithJS(productSearched);
        //productSearched.click();
    }

    public void clickedInDenWarenkorb(){
        WebUtils.clickWithJS(buttonInDenWarenkorb);
        //buttonInDenWarenkorb.click();
    }

    public void navigateToCartItem(){
        WebUtils.clickWithJS(cartIcon);
        //cartIcon.click();
    }



}
