package steps;

import elements.CatalogElements;

public class CatalogSteps {
    CatalogElements catalogElements = new CatalogElements();

    public void clickOnAddToCartButton(int addToCartButtonIndex) {
        catalogElements.addToCartButtonsCollection.get(addToCartButtonIndex - 1).click();
    }


}
