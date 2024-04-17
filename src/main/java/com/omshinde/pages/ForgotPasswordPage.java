package com.omshinde.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{
    @FindBy(id="recover")
    private WebElement rstPassLabEle;
    @FindBy(id="RecoverEmail")
    private WebElement emailEle;
    @FindBy(id="submit")
    private WebElement submitEle;
    @FindBy(linkText ="Cancle" )
    private WebElement cancleEle;



    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email){

        //enter email id
        emailEle.sendKeys(email);
    }
    public PasswordConfirmPage clickSubmit(){
        //click on submit button
        submitEle.click();
        return new PasswordConfirmPage(driver);

    }
    public LoginPage clickCancle(){
        //click on cancle
        cancleEle.click();
        return new LoginPage(driver);

    }
}
