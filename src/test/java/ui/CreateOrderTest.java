package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import models.AddressBuilder;
import models.PaymentBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.*;

public class CreateOrderTest {

        LoginSteps loginSteps = new LoginSteps();
        RegisterStep registerStep = new RegisterStep();
        LogoutStep logoutStep = new LogoutStep();
        MainPageSteps mainPageSteps = new MainPageSteps();
        CartSteps cartSteps = new CartSteps();
        ProductPageSteps productPageSteps = new ProductPageSteps();
        ClearData clearData = new ClearData();
        OrdersStep ordersStep = new OrdersStep();


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

    @Test(description = "check that order created")
    public void creatingOrder(){


        mainPageSteps.goToCatalogueButton();
        //productPageSteps.addFirstProductToCart();
        productPageSteps.addFirstProductToCart();

        productPageSteps.addToCartButton();
       /* mainPageSteps.goToCatalogueButton();
        productPageSteps.addSecondProductToCart();
        productPageSteps.addToCartButton();*/

        mainPageSteps.cartButtonClick();


        AddressBuilder addressBuilder = cartSteps.fillAddressInCart(new AddressBuilder()
                .city("Kyiv")
                .country("Ukr")
                .houseNumber("25")
                .postCode("12123")
                .streetName("asd"));

        cartSteps.fillPaymentInCart(new PaymentBuilder()
                .cartNumber("123123123")
                .expires("12/12")
                .cvv("123"));

        cartSteps.clickToProceedToCheckoutButton();

        ordersStep.viewButtonInOrders();

        ordersStep.checkCompareShippingAddress();

        //ordersStep.checkExactHouseNumber();

        //artSteps.fillAddressInCart();
//
        //
        //
        //
        //div.row.addresses

        productPageSteps.checkProductParameters();

        logoutStep.logout();
    }

}
