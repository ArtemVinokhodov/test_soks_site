package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import elements.CartElements;
import models.AddressBuilder;
import models.PaymentBuilder;

public class CartSteps {
    CartElements cartElements = new CartElements();
    public void clearData() {
        if(cartElements.cartPageElement.exists() && cartElements.productElements.size() > 0) {
            for (int i = 0; i < cartElements.productElements.size(); i++) {
                cartElements.trashButtonElements.get(0).click();
            }
        }
    }
    public AddressBuilder fillAddressInCart(AddressBuilder addressBuilder){
        cartElements.shippingAddress.click();
        cartElements.houseNumber.setValue(addressBuilder.getHouseNumber());
        cartElements.streetName.setValue(addressBuilder.getStreetName());
        cartElements.city.setValue(addressBuilder.getCity());
        cartElements.postCode.setValue(addressBuilder.getPostCode());
        cartElements.country.setValue(addressBuilder.getCountry());
        cartElements.updateAddressButton.click();
        return addressBuilder;
    }
    public void fillAddressInCart(){
        AddressBuilder addressBuilder = new AddressBuilder();
        cartElements.shippingAddress.click();
        cartElements.houseNumber.setValue(addressBuilder.getHouseNumber());
        cartElements.streetName.setValue(addressBuilder.getStreetName());
        cartElements.city.setValue(addressBuilder.getCity());
        cartElements.postCode.setValue(addressBuilder.getPostCode());
        cartElements.country.setValue(addressBuilder.getCountry());
        cartElements.updateAddressButton.click();
    }
    public void fillPaymentInCart(PaymentBuilder paymentBuilder){
        cartElements.payment.click();
        cartElements.cartNumber.setValue(paymentBuilder.getCartNumber());
        cartElements.expires.setValue(paymentBuilder.getExpires());
        cartElements.ccv.setValue(paymentBuilder.getCvv());
        cartElements.updateCreditCardButton.click();
    }

    public void waitForPaymentModelDisappear() {
    cartElements.paymentModal.waitUntil(Condition.disappear,5000);
    }

    public void clickToProceedToCheckoutButton() {
        //cartElements.checkout.click();
        cartElements.checkout.waitUntil(Condition.visible,10000).click();
    }
    public void setQuantityProducts(String quantity) {
        cartElements.quantityCounterInput.setValue(quantity);
    }
    public void checkProductElementsSize(int size) {
        cartElements.productElements.shouldHave(CollectionCondition.size(size));;
    }



}
