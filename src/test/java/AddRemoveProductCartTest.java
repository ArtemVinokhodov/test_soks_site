/*
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import elements.CartElements;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.CartSteps;
import steps.LoginSteps;
import steps.MainPageSteps;
import steps.ProductPageSteps;

import static com.codeborne.selenide.Selenide.open;

public class AddRemoveProductCartTest {
    CartElements cartElements = new CartElements();
    MainPageSteps mainPageSteps = new MainPageSteps();
    LoginSteps loginSteps = new LoginSteps();
    CartSteps cartSteps = new CartSteps();
    ProductPageSteps productPageSteps = new ProductPageSteps();

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
        cartSteps.clearData();
        mainPageSteps.checkQuantityOfItemsOnCartButton("0");
        Selenide.clearBrowserCookies();
    }

    @Test(description = "check adding one product to cart")
    public void addingProductToCartCheck() {
        mainPageSteps.goToTheFirstProductPage();
        mainPageSteps.checkQuantityOfItemsOnCartButton("1");
        cartSteps.setQuantityProducts("5");
    }

    @Test(description = "check adding two products to cart")
    public void addingTwoProductsToCartCheck() {
        mainPageSteps.goToTheFirstProductPage();
        open("http://localhost/");
        mainPageSteps.goToTheSecondProductPage();
        mainPageSteps.checkQuantityOfItemsOnCartButton("2");
        mainPageSteps.cartButtonClick();
        cartSteps.checkProductElementsSize(2);
    }
}
*/
