package com.omshinde.pages;

import com.omshinde.models.Address;
import com.omshinde.pages.components.NewAddressComponent;
import com.omshinde.pages.components.UpdateAddressComponent;

import java.util.ArrayList;
import java.util.List;

public class AddressPage {
    private String addressLabel;
    private String returnAccountDetailsPage;
    private String addNewAddressBtn;
    private String addressType;
    private String userAddress;
    private String userCountry;
    private String editBtn;
    private String deleteBtn;

    public ProfilePage clickReturnToAccountDetails(){
        //return to profile
        return new ProfilePage();
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
