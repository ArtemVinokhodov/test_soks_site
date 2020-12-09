package steps;

import com.codeborne.selenide.Condition;
import elements.MainElements;

public class MainPageSteps {
    MainElements mainElements = new MainElements();

    public void goToTheFirstProductPage(){
        mainElements.nameOfProduct.click();
    }
    public void goToTheSecondProductPage() {
        mainElements.nameOfProduct2.click();
    }
    public void goToTheCart(){
        mainElements.cartButton.click();
    }

    public void checkQuantityOfItemsOnCartButton(String text) {
        mainElements.cartButton.shouldHave(Condition.text(text));
    }

    public void cartButtonClick() {
        mainElements.cartButton.click();
    }
   /* public void cartButtonShouldBeVisible() {
        mainElements.cartButton.shouldBe(Condition.visible);
    }*/

    public void logoutButtonShouldBeVisible() {
        mainElements.logoutButton.shouldBe(Condition.visible);
    }
    public void checkEmptyItemsOnCartButton() {
        mainElements.cartButton.shouldHave(Condition.text("0 items in cart"));
    }
    public void goToCatalogueButton() {
        mainElements.CatalogueButton.click();
    }
    public void cartButtonHasTwoProducts() {
        mainElements.twoQuantityItemsInCartButton.shouldHave(Condition.text("2 item(s) in cart"));
    }

}
