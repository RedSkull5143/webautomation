package com.omshinde.pages;

import com.omshinde.models.Product;

import java.util.List;

public class SearchResultPage {
    private List<Product> products;

    public SearchResultPage(List<Product> products){
        this.products=products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
