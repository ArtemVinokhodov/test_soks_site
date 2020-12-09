package steps;

import elements.LoginElements;
import elements.MainElements;

import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {
    LoginElements loginElements = new LoginElements();
    MainElements mainElements = new MainElements();
    RegisterStep registerStep = new RegisterStep();

    public void login() {
        open("http://localhost/");
        mainElements.loginButton.click();
        String username = registerStep.register();
        loginElements.inputUsername.setValue(username);
        loginElements.loginButton.click();
    }
}
