package com.omshinde.pages;

import com.omshinde.models.Address;
import com.omshinde.pages.components.NewAddressComponent;
import com.omshinde.pages.components.UpdateAddressComponent;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AddressPage extends  BasePage{
    private String addressLabel;
    private String returnAccountDetailsPage;
    private String addNewAddressBtn;
    private String addressType;
    private String userAddress;
    private String userCountry;
    private String editBtn;
    private String deleteBtn;

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public ProfilePage clickReturnToAccountDetails(){
        //return to profile
        return new ProfilePage(driver);
    }
    //components
    public NewAddressComponent clickAddNewAddressBtn(){
        //add new address
        return new NewAddressComponent();
    }

    //return Address
    public List<Address> getUserAddressList(){
        return new ArrayList<>();
    }
    public UpdateAddressComponent updateAddress(){
        return new UpdateAddressComponent();
    }
}
