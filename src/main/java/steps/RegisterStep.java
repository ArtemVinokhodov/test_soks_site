package steps;

import elements.MainElements;
import elements.RegisterElement;

import static com.codeborne.selenide.Selenide.open;

public class RegisterStep {
    MainElements mainElements = new MainElements();
    RegisterElement registerElement = new RegisterElement();


    public String register(){
        double reg = Math.random();
        String reg1 = "User";
        String regUser = reg1 + reg;
        open("http://localhost/");
        mainElements.registerButton.click();
        registerElement.registerUserName.setValue(regUser);
        registerElement.registerButtonOnFormRegistration.click();
        return regUser;
    }

}
