package com.omshinde.pages.components;

import com.omshinde.models.Product;
import com.omshinde.pages.AddressPage;
import com.omshinde.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class ProductComponent extends BaseCompnent {
    private String productImage;
    private String productName;
    private int productPrice;
    private boolean isAvailable;

    public ProductComponent(WebDriver driver) {
        super(driver);
    }

    public Product getProductDetails(){
        return new Product();
    }
}
