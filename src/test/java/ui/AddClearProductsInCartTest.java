
package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import elements.CatalogElements;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.*;

public class AddClearProductsInCartTest {
    LoginSteps loginSteps = new LoginSteps();
    RegisterStep registerStep = new RegisterStep();
    LogoutStep logoutStep = new LogoutStep();
    MainPageSteps mainPageSteps = new MainPageSteps();
    CartSteps cartSteps = new CartSteps();
    ProductPageSteps productPageSteps = new ProductPageSteps();
    ClearData clearData = new ClearData();
    CatalogSteps catalogSteps = new CatalogSteps();


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

    @Test(description = "check adding and removing products in cart")
    public void checkAddingRemovingInCart() {

        //(description = "check that cart is empty")
        mainPageSteps.checkEmptyItemsOnCartButton();

        //(description = "adding two products in cart" )
        mainPageSteps.goToCatalogueButton();
        //productPageSteps.addFirstProductToCart();
        catalogSteps.clickOnAddToCartButton(1);

        //productPageSteps.addToCartButton();
        //mainPageSteps.goToCatalogueButton();
        catalogSteps.clickOnAddToCartButton(2);
       // productPageSteps.addSecondProductToCart();
        //productPageSteps.addToCartButton();


        // (description = "check that added two products in cart" )
        mainPageSteps.cartButtonHasTwoProducts();

        mainPageSteps.cartButtonClick();
        cartSteps.checkProductElementsSize(2);

        //(description = "clear cart" )
        clearData.clearData();

        //(description = "logout" )
        logoutStep.logout();

    }
}

