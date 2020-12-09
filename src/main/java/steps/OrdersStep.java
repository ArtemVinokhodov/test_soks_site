package steps;

import com.codeborne.selenide.Condition;
import elements.MyOrders;
import models.AddressBuilder;
import org.jsoup.select.Evaluator;

public class OrdersStep {
    MyOrders myOrders = new MyOrders();
    AddressBuilder addressBuilder = new AddressBuilder();

    public void myOrderStatus() {
        myOrders.status.should(Condition.exist);
    }
    public void viewButtonInOrders(){
        myOrders.orderActionViewButton.waitUntil(Condition.visible,10000).click();
    }

   /* public void checkExactHouseNumber() {
        myOrders.shippingAddressInOrder.shouldHave(Condition.exactText(addressBuilder.getHouseNumber()));
        //myOrders.shippingAddressInOrder.shouldHave(Condition.exactText(addressBuilder.houseNumber());
    }*/

    public void checkCompareShippingAddress() {
        //myOrders.shippingAddressTextInView.getText().contains("12", "asd", "Kyiv", "12123", "123");
        //myOrders.shippingAddressTextInView.getText().contains("12 asd Kyiv 12123 123");
        myOrders.shippingAddressTextInView.getText().contains("12");
        myOrders.shippingAddressTextInView.getText().contains("asd");
        myOrders.shippingAddressTextInView.getText().contains("Kyiv3");
        myOrders.shippingAddressTextInView.getText().contains("12123");
        myOrders.shippingAddressTextInView.getText().contains("123");
    }
}
