package models;

public class PaymentBuilder {
    String cartNumber = "123123123";
    String expires = "12/12";
    String cvv = "123";


    public String getCartNumber() { return cartNumber; }

    public String getExpires() {
        return expires;
    }

    public String getCvv() {
        return cvv;
    }

    public PaymentBuilder cartNumber (String cartNumber) {
        this.cartNumber = cartNumber;
        return this;
    }
    public PaymentBuilder expires (String expires) {
        this.expires = expires;
        return this;
    }
    public PaymentBuilder cvv (String cvv) {
        this.cvv = cvv;
        return this;
    }

    @Override
    public String toString() {
        return "PaymentBuilder{" +
                "cartNumber='" + cartNumber + '\'' +
                ", expires='" + expires + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
