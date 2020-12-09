package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CartElements {
   public SelenideElement quantityCounterInput = $("input[type=\"number\"]");
   public SelenideElement cartPageElement = $("div#basket");
   public ElementsCollection productElements = $$("tr.item");
   public ElementsCollection trashButtonElements = $$("i.fa.fa-trash-o");




   public SelenideElement shippingAddress = $("a[data-target='#address-modal']");
   public SelenideElement houseNumber = $("input#form-number");
   public SelenideElement streetName = $("input#form-street");
   public SelenideElement city = $("input#form-city");
   public SelenideElement postCode = $("#form-post-code");
   public SelenideElement country = $("#form-country");
   public SelenideElement updateAddressButton = $x("//*[@id=\"form-address\"]/p/button/i"); //какой селектор оптимальный?


   public SelenideElement payment = $("a[data-target='#card-modal']");
   public SelenideElement cartNumber = $("input#form-card-number");
   public SelenideElement expires = $("input#form-expires");
   public SelenideElement ccv = $("input#form-ccv");
   public SelenideElement updateCreditCardButton = $x("//*[@id=\"card-modal\"]/div/div/div[2]/p/button/i");

   public SelenideElement paymentModal = $("div#card-modal");
   public SelenideElement checkout = $("button#orderButton");
   public SelenideElement myOrders = $("div#customer-orders");

}
