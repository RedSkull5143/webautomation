package com.omshinde.pages.components;

import com.omshinde.models.Address;
import com.omshinde.pages.AddressPage;
import org.openqa.selenium.WebDriver;

public class UpdateAddressComponent extends NewAddressComponent{
    private String updateAddressBtn;

    public UpdateAddressComponent(WebDriver driver) {
        super(driver);
    }

    public AddressPage updateAddress(Address address){
        super.enterFirstName(address.getFirstName());
        super.enterLastName(address.getLastName());
        return clickUpdateAddressBtn();
    }

    public AddressPage clickUpdateAddressBtn(){
        return new AddressPage(driver);
    }
}
