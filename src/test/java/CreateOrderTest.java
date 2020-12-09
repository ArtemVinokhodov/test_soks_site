/*
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import elements.CartElements;
import elements.MyOrders;
import models.AddressBuilder;
import models.PaymentBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.*;


public class CreateOrderTest {
    private CartElements cartElements = new CartElements();
    private MyOrders myOrders = new MyOrders();
    LoginSteps loginSteps = new LoginSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    ProductPageSteps productPageSteps = new ProductPageSteps();
    CartSteps cartSteps = new CartSteps();
    OrdersStep ordersStep = new OrdersStep();


    @BeforeTest
    public void beforeT() {
        Configuration.holdBrowserOpen = true;
    }

    @BeforeMethod
    public void beforeM() {
        loginSteps.login();
    }

    @AfterMethod
    public void clearData() {
        Selenide.clearBrowserCookies();
    }

    @Test(description = "check created order")
    public void createOrderCheck() {
        mainPageSteps.goToTheFirstProductPage();
        productPageSteps.addProductToCart();

        mainPageSteps.goToTheSecondProductPage();
        productPageSteps.addProductToCart();
        mainPageSteps.goToTheCart();

        cartSteps.fillAddressInCart(new AddressBuilder()
                .city("Kyiv")
                .country("Ukr")
                .houseNumber("25")
                .postCode("12123")
                .streetName("asd"));


        cartSteps.fillPaymentInCart(new PaymentBuilder()
                .cartNumber("123123123")
                .expires("12/12")
                .cvv("123"));


        cartSteps.waitForPaymentModelDisappear();
        cartSteps.clickToProceedToCheckoutButton();
        //cartElements.checkout.click();

    }
    @Test(description = "check status order")
        public void statusOrderCheck() {
        ordersStep.myOrderStatus();
      for (int i = 0; i < cartElements.productElements.size(); i++) {
            cartElements.trashButtonElements.get(0).click();
        }
        mainPageSteps.checkQuantityOfItemsOnCartButton("0");
*/























