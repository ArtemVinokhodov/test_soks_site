package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.*;

public class SortOfProductTest {

    LoginSteps loginSteps = new LoginSteps();
    RegisterStep registerStep = new RegisterStep();
    LogoutStep logoutStep = new LogoutStep();
    MainPageSteps mainPageSteps = new MainPageSteps();
    CartSteps cartSteps = new CartSteps();
    ProductPageSteps productPageSteps = new ProductPageSteps();
    ClearData clearData = new ClearData();


    @BeforeTest
    public void beforeT() {
        Configuration.holdBrowserOpen = true;
    }

    @BeforeMethod
    public void beforeM() {
        registerStep.register();
        //logoutStep.logout();
        //loginSteps.login();
    }
    @AfterMethod
    public void clearBrowserCookies() {
        Selenide.clearBrowserCookies();
    }

    @Test(description = "check Show product in Catalog")
    public void sortingProductOnPage(){

        mainPageSteps.goToCatalogueButton();
        productPageSteps.checkQuantityOfProductsOnPage(6);
        productPageSteps.selectShowButtonForShowQuantityProductsOnPage();
        //productPageSteps.selectShowProductsOnPage(3);
        productPageSteps.checkQuantityOfProductsOnPage(3);

        logoutStep.logout();
    }
    @Test(description = "check Filter product in Catalog")
    public void filterSortingProductOnPage() {
        mainPageSteps.goToCatalogueButton();
        productPageSteps.filterCheckboxBlueStep();
        productPageSteps.filterFormApplyButtonStep();

        logoutStep.logout();
    }

}

