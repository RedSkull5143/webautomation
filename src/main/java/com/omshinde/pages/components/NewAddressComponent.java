package com.omshinde.pages.components;

import com.omshinde.models.Address;
import com.omshinde.pages.AddressPage;
import org.checkerframework.checker.units.qual.A;

public class NewAddressComponent {
    private String firstName;
    private String lastName;
    private String addAddressBtn;

    public void enterFirstName(String firstName){

    }
    public void enterLastName(String lastName){

    }
    public AddressPage clickAddressBtn(){
        return new AddressPage();
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
