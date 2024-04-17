package com.omshinde.pages;

import com.omshinde.models.Product;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SearchResultPage extends BasePage {
    private List<Product> products;

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    public List<Product> getProducts() {
        return products;
    }
}
