package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainElements {
    public SelenideElement loginButton = $("a[data-target=\"#login-modal\"]");
    public SelenideElement cartButton = $("span#numItemsInCart");
    public SelenideElement nameOfProduct = $x("//a[text()='Figueroa']");
    public SelenideElement nameOfProduct2 = $x("//a[text()='Crossed']");
    public SelenideElement twoQuantityItemsInCartButton = $x("//span[text()='2 item(s) in cart']");
    public SelenideElement cartIsEmpty = $x("//span[text()='0 items in cart']");

    public SelenideElement logoutButton = $x("li#logout");

    public SelenideElement registerButton = $("li#register");
    public SelenideElement CatalogueButton = $x("//a[text()='Catalogue']");







}
