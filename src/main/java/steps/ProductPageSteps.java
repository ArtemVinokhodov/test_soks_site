package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import elements.ProductElements;

import java.util.ArrayList;

public class ProductPageSteps {
    ProductElements productElements = new ProductElements();

    public void addFirstProductToCart() {
        productElements.selectFirstProductInCatalog.click();
        //productElements.addToCartButton.click();
    }

    public void addSecondProductToCart() {
        productElements.selectSecondProductInCatalog.waitUntil(Condition.visible, 10000).click();
        //productElements.addToCartButton.click();
    }

    public void addToCartButton() {
        productElements.addToCartButton.click();
    }

    public void checkQuantityOfProductsOnPage(int productsOnPage) {
        productElements.catalogProducts.shouldHave(CollectionCondition.size(productsOnPage));
    }

    public void selectShowProductsOnPage(int showProductButton) {
        productElements.showProductsNumberInCatalogButton.shouldHave(CollectionCondition.size(showProductButton));
    }

    public void selectShowButtonForShowQuantityProductsOnPage() {
        productElements.showButtonForShowQuantityProductsOnPageButton.click();
    }

    public void filterCheckboxBlueStep() {
        productElements.filterCheckboxBlue.waitUntil(Condition.visible, 10000).click();
    }

    public void filterFormApplyButtonStep() {
        productElements.filterFormApplyButton.click();
    }

    public void checkProductParameters() {

//        if (productElements.productParametersInShippingCart.equals(productElements.productParametersInOrder)) {

//        }
//        for (int i = 0; i < productElements.productParametersInShippingCart.size(); i++) {
//            productElements.productParametersInShippingCart.get(i).contains(productElements.productParametersInOrder);
//        }
//        productElements.productParametersInShippingCart.getText().contains(productElements.productParametersInOrder);

            //productElements.productParametersInShippingCart.get(8).getText().contains(productElements.productParametersInOrder.get(8).getText());
    //    productElements.productParametersInShippingCart.get(1).getText().contains(productElements.productParametersInOrder.get(1).getText());

        for (int i = 0; i < productElements.productParametersInShippingCart.size(); i++) {
            productElements.productParametersInShippingCart.get(i).getText().contains(productElements.productParametersInOrder.get(i).getText());
       }

        }

    }


