package com.omshinde.pages.components;

import com.omshinde.models.Product;

public class ProductComponent {
    private String productImage;
    private String productName;
    private int productPrice;
    private boolean isAvailable;

    public Product getProductDetails(){
        return new Product();
    }
}
