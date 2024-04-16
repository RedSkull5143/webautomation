package com.omshinde.services;

import com.omshinde.models.Product;
import com.omshinde.models.ProductsInventory;
import com.omshinde.pages.SearchResultPage;

import java.util.List;
import java.util.stream.Collectors;

public class ProductSearcher {
    private ProductsInventory productsInventory;

    public ProductSearcher(ProductsInventory tempProductsInventory) {
        this.productsInventory=tempProductsInventory;
    }

    public SearchResultPage searchProduct(String productName){
        List<Product> matchedProducts=productsInventory.getProductList().stream()
                .filter(product -> product.getProductName().contains(productName))
                .collect(Collectors.toList());

        return new SearchResultPage(matchedProducts);
    }
}
