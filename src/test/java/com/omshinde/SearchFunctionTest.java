package com.omshinde;

import com.omshinde.models.Product;
import com.omshinde.models.ProductsInventory;
import com.omshinde.pages.SearchResultPage;
import com.omshinde.pages.components.SearchBoxComponent;
import com.omshinde.services.ProductSearcher;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchFunctionTest {
    //open url
    //click search icon
    //enter product name
    //click search icon to submit the search
    //redirect to search result page

    //create an inventory
    //create searchBoxComponent
    //search
    //get searchResult
    //Verify

    @Test
    public void Search() {
        ProductsInventory tempProductsInventory = new ProductsInventory();
//        tempProductsInventory.getProductList().add(new Product(""));
        Product dress=new Product();
        dress.setProductName("WhiteDress");
        dress.setProductPrice(500);

        tempProductsInventory.getProductList().add(dress);
        SearchBoxComponent searchBoxComponent = new SearchBoxComponent(tempProductsInventory);
        searchBoxComponent.setSearchProductName("WhiteDress");
        SearchResultPage searchResultPage = searchBoxComponent.clickSearchBtn();
        List<Product> matchedProducts=searchResultPage.getProducts();

        Assert.assertTrue(matchedProducts.stream().
                allMatch(product -> product.getProductName().contains(searchBoxComponent.getSearchProductName())));

    }


}
