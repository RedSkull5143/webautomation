    package com.omshinde.pages;

    import com.omshinde.models.ProductsInventory;
    import com.omshinde.pages.components.SearchBoxComponent;

    public class HomePage {
        private String searchBtn;
        private String profileBtn;
        private String cartBtn;
        private ProductsInventory productsInventory;

        public SearchBoxComponent clickSearchBtn(){
            return new SearchBoxComponent(productsInventory);
        }
    }
