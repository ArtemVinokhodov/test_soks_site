package steps;

public class ClearData {
    MainPageSteps mainPageSteps = new MainPageSteps();
    CartSteps cartSteps = new CartSteps();

    public void clearData(){
        cartSteps.clearData();
        mainPageSteps.checkQuantityOfItemsOnCartButton("0");
    }

}

