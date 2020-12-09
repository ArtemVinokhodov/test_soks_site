package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MyOrders {
    public SelenideElement status = $("div#customer-orders");
    //public SelenideElement orderActionViewButton = $("//a[text()='View']");
    //public SelenideElement orderActionViewButton = $x("//*[@id=\"tableOrders\"]/tr[1]/td[4]/a");
    public SelenideElement orderActionViewButton = $("a.btn.btn-primary.btn-sm");

    public SelenideElement shippingAddressInOrder = $x("//*[@id=\"customer-order\"]/div/div[2]/div[2]");


    public SelenideElement shippingAddressTextInView = $("div.row.addresses");



}
