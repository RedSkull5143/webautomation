package com.omshinde.pages.components;

import com.omshinde.models.Address;
import com.omshinde.pages.AddressPage;

public class UpdateAddressComponent extends NewAddressComponent{
    private String updateAddressBtn;

    public AddressPage updateAddress(Address address){
        super.enterFirstName(address.getFirstName());
        super.enterLastName(address.getLastName());
        return clickUpdateAddressBtn();
    }

    public AddressPage clickUpdateAddressBtn(){
        return new AddressPage();
    }
}
