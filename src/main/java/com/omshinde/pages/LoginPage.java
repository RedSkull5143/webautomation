package com.omshinde.pages;

import com.omshinde.models.Credentials;

public class LoginPage {

    //mainbody
    private String email;
    private String password;
    private String signInBtn;
    private String forgotPasswordLink;
    private String createAccount;
    private String loginLabel;

    public void enterEmail(String email){
        //enter email

    }
    public void enterPassword(String password){
        //enter password

    }
    public ProfilePage clickSignIn(){
        //Sign In
        return new ProfilePage();
    }
    public CreateAccountPage navToCreateAccount(){
        //create account
        return new CreateAccountPage();
    }
    public ForgotPasswordPage navToForgotPassword(){
        //forgot password
        return new ForgotPasswordPage();
    }
    public ProfilePage login(Credentials credentials){
        enterEmail(credentials.getEmail());
        enterPassword(credentials.getPassword());
        return clickSignIn();
    }


}
