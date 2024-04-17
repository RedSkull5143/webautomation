package com.omshinde.pages;

import com.omshinde.models.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage{

    //mainbody
    @FindBy(id="CustomerEmail")
    private WebElement emailEle;
    @FindBy(id="CustomerPassword")
    private WebElement passwordEle;
    @FindBy(id="")
    private WebElement signInBtnEle;
    @FindBy(linkText = "Forgot your password?")
    private WebElement forgotPasswordLinkEle;
    @FindBy(linkText = "Create account")
    private WebElement createAccountEle;
    @FindBy(id="login")
    private WebElement loginLabelEle;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email){
        //enter email
        emailEle.sendKeys(email);

    }
    public void enterPassword(String password){
        //enter password
        passwordEle.sendKeys(password);

    }
    public ProfilePage clickSignIn(){
        //Sign In
        signInBtnEle.click();
        return new ProfilePage(driver);

    }
    public CreateAccountPage navToCreateAccount(){
        //create account
        createAccountEle.click();
        return new CreateAccountPage(driver);
    }
    public ForgotPasswordPage navToForgotPassword(){
        //forgot password
        forgotPasswordLinkEle.click();
        return new ForgotPasswordPage(driver);
    }
    public ProfilePage login(Credentials credentials){
        enterEmail(credentials.getEmail());
        enterPassword(credentials.getPassword());
        return clickSignIn();
    }


}
