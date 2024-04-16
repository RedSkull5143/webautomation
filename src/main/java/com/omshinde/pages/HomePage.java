    package com.omshinde.pages;

    import com.omshinde.models.ProductsInventory;
    import com.omshinde.pages.components.ProductComponent;
    import com.omshinde.pages.components.SearchBoxComponent;

    import java.util.List;

    public class HomePage {
        private String searchBtn;
        private String profileBtn;
        private String cartBtn;
        private List<ProductComponent> productComponentList;

        public SearchBoxComponent clickSearchBtn(){
            return new SearchBoxComponent();
        }
    }
