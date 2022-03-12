package com.fashionette.pages;

import com.fashionette.utilities.WebUtils;
import com.fashionette.utilities.ConfigurationReader;
import com.fashionette.utilities.Driver;
import io.github.sukgu.Shadow;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

    WebDriver driver=Driver.get();

    public void LandingPageFashionette(){
        driver.get(ConfigurationReader.get("url"));
        WebUtils.waitFor(10);

        Shadow shadow = new Shadow(driver);
        shadow.findElement("button[role='button']").click();

    }


    @FindBy(xpath="//*[@data-id='user login']")
    public WebElement loginButton;

    @FindBy(xpath="//input[@name='email']")
    public WebElement usernameBox;

    @FindBy(xpath="(//input)[3]")
    public WebElement username1;

    @FindBy(xpath="//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath="//button[contains(text(),'Einloggen')]")
    public WebElement einloggenButton;

    @FindBy(xpath="//div[contains(text(),'Das hat leider nicht funktioniert. Bitte überprüfe')]")
    public WebElement textLoginAttemptWithInvalidCredentials;


    public void navigateTologinPage(){
      loginButton.click();
        WebUtils.waitFor(5);
    }

    public void login(){
        String usernameFashionette = ConfigurationReader.get("username");
        String passwordFashionette = ConfigurationReader.get("password");
        username1.sendKeys(usernameFashionette);
        passwordBox.sendKeys(passwordFashionette);
        WebUtils.clickWithJS(einloggenButton);
    }

    public void loginWithInvalidCredentials(String usernameIn,String passwordIn) {
        usernameBox.sendKeys(usernameIn);
        passwordBox.sendKeys(passwordIn);
        WebUtils.clickWithJS(einloggenButton);
        WebUtils.waitFor(5);
    }

    public void textAfterInvalidCredentials(String textAfterInvalid) {
        String actualInvalidMessage = textLoginAttemptWithInvalidCredentials.getText();
        Assert.assertEquals(actualInvalidMessage, textAfterInvalid);
    }


}
