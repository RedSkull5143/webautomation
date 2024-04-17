package com.omshinde.pages.components;

import com.omshinde.models.Address;
import com.omshinde.pages.AddressPage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;

public class NewAddressComponent extends AddressPage {
    private String firstName;
    private String lastName;
    private String addAddressBtn;

    public NewAddressComponent(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName){

    }
    public void enterLastName(String lastName){

    }
    public AddressPage clickAddressBtn(){
        return new AddressPage(driver);
    }

    public AddressPage addNewAddress(Address address){
        //entered firstName
        //entered lastName
        //entered address
        //entered city
        //click addNewAddress
        enterFirstName(address.getFirstName());
        enterLastName(address.getLastName());
        return clickAddressBtn();
    }
}
