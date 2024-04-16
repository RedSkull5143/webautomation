package com.omshinde.pages.components;

import com.omshinde.models.Product;
import com.omshinde.models.ProductsInventory;
import com.omshinde.pages.SearchResultPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SearchBoxComponent {
    private String searchProductName;
    private String searchBtn;
    private ProductsInventory productsInventory;

    public void search(String query){

    }
    public String getSearchProductName() {
        return searchProductName;
    }

    public void setSearchProductName(String searchProductName) {
        this.searchProductName = searchProductName;
    }

    public String getSearchBtn() {
        return searchBtn;
    }

    public void setSearchBtn(String searchBtn) {
        this.searchBtn = searchBtn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchBoxComponent that = (SearchBoxComponent) o;
        return Objects.equals(searchProductName, that.searchProductName) && Objects.equals(searchBtn, that.searchBtn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchProductName, searchBtn);
    }

    //search product
    public SearchResultPage clickSearchBtn() {
        List<Product> matchedProducts=productsInventory.getProductList().stream()
                .filter(product -> product.getProductName().contains(searchProductName))
                .collect(Collectors.toList());

        return new SearchResultPage(matchedProducts);
    }}
