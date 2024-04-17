    package com.omshinde.pages;

    import com.omshinde.models.ProductsInventory;
    import com.omshinde.pages.components.ProductComponent;
    import com.omshinde.pages.components.SearchBoxComponent;
    import org.openqa.selenium.WebDriver;

    import java.util.List;

    public class HomePage extends BasePage{
        private String searchBtn;
        private String profileBtn;
        private String cartBtn;
        private List<ProductComponent> productComponentList;

        public HomePage(WebDriver driver) {
            super(driver);
        }

        public SearchBoxComponent clickSearchBtn(){
            return new SearchBoxComponent();
        }
    }
