package com.omshinde.models;

import java.util.ArrayList;
import java.util.List;

public class ProductsInventory {
    private List<Product> productList;

    public ProductsInventory(){
        productList=new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }
}
