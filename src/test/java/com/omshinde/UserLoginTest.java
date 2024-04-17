package com.omshinde;

import com.omshinde.models.Credentials;
import com.omshinde.models.User;
import com.omshinde.pages.AddressPage;
import com.omshinde.pages.LoginPage;
import com.omshinde.pages.ProfilePage;
import com.omshinde.models.Address;
import com.omshinde.pages.components.NewAddressComponent;
import com.omshinde.pages.components.UpdateAddressComponent;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserLoginTest extends  BaseTest {

    @Test(testName = "User Login Test")
    public void testUserLogin(){
        //open url
        //click on profile icon
        //read the Credentials from the json
        //arrange
        User user=new User();
        LoginPage loginPage=new LoginPage(driver);

        //act
        //loginPage.enterEmail(user.getEmail());
//        loginPage.enterPassword(user.getPassword());
//        ProfilePage profilePage = loginPage.clickSignIn();
        ProfilePage profilePage = loginPage.login(user.getCredentials());
        //enter username
        //enter password
        //click on Sign In

        //assert
        //verify user is able to open dashboard
        User registeredUser1 = profilePage.viewAccountDetails();
        Assert.assertEquals(registeredUser1.getFirstName(),user.getFirstName());
        Assert.assertEquals(registeredUser1.getCountry(),user.getCountry());
    }

    @Test(testName = "Add new Address Test")
    public void testAddNewAddress(){
        //open url
        //click on profile icon
        //read the Credentials from the json
        //arrange
        Address address=new Address();
        User user=new User();
        user.addAddress(address);
        LoginPage loginPage=new LoginPage(driver);

        //act
        //loginPage.enterEmail(user.getEmail());
//        loginPage.enterPassword(user.getPassword());
//        ProfilePage profilePage = loginPage.clickSignIn();
        ProfilePage profilePage = loginPage.login(user.getCredentials());
        AddressPage addressPage = profilePage.clickViewAddress();
        NewAddressComponent newAddressComponent = addressPage.clickAddNewAddressBtn();
        AddressPage addressPage1 = newAddressComponent.addNewAddress(address);
        List<Address> userAddressList = addressPage1.getUserAddressList();
        //enter username
        //enter password
        //click on Sign In

        //assert
        //verify user is able to open dashboard
        Assert.assertTrue(userAddressList.contains(address));
    }

    @Test(testName = "Update Test")
    public void testUpdateAddress(){
        //open url
        //click on profile icon
        //read the Credentials from the json
        //arrange
        Address address=new Address();
        User user=new User();
        user.addAddress(address);
        LoginPage loginPage=new LoginPage(driver);

        //act
        //loginPage.enterEmail(user.getEmail());
//        loginPage.enterPassword(user.getPassword());
//        ProfilePage profilePage = loginPage.clickSignIn();
        ProfilePage profilePage = loginPage.login(user.getCredentials());
        AddressPage addressPage = profilePage.clickViewAddress();
        NewAddressComponent newAddressComponent = addressPage.clickAddNewAddressBtn();
        addressPage= newAddressComponent.addNewAddress(address);
        address.setFirstName("khushi");
        UpdateAddressComponent updateAddressComponent = addressPage.updateAddress();
        addressPage= updateAddressComponent.updateAddress(address);

        List<Address> userAddressList = addressPage.getUserAddressList();
        //enter username
        //enter password
        //click on Sign In

        //assert
        //verify user is able to open dashboard
        Assert.assertTrue(userAddressList.contains(address));
    }

    //using WebDriver


}
