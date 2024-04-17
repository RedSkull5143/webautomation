package com.omshinde.pages;

import com.omshinde.models.User;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {
    private String accountLabel;
    private String logOutBtn;
    private String orderHistory;
    private String accountDetails;
    private String userName;
    private String userCountry;
    private String viewAddress;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLogOut(){
        //logout
        return new LoginPage(driver);
    }

    public void viewOrderHistory(){
        //view Order History
    }

    public User viewAccountDetails(){
        //view user details includes name & country
        return new User();
    }

    public AddressPage clickViewAddress(){
        //redirect to view address
        return new AddressPage(driver);
    }

}
