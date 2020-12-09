package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ProductElements {
    public SelenideElement addToCartButton = $("a#buttonCart");
    public SelenideElement selectFirstProductInCatalog = $x("//*[@id=\"products\"]/div[3]");
    public SelenideElement selectSecondProductInCatalog = $x("//*[@id=\"products\"]/div[2]");
    public ElementsCollection catalogProducts = $$("div.product");
    public ElementsCollection showProductsNumberInCatalogButton = $$("div#products-number");

    public SelenideElement showButtonForShowQuantityProductsOnPageButton = $("a[onclick=\"setNewPageSize(3)\"]");

    public SelenideElement filterCheckboxBlue = $("input[value=\"blue\"]");
    public SelenideElement filterFormApplyButton = $x("//*[@id=\"filters-form\"]/a");

    public ElementsCollection productParametersInShippingCart = $$("tbody#cart-list");
    public ElementsCollection productParametersInOrder = $$("tbody#tableOrder");


}
