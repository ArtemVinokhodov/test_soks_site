package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegisterElement {
    public SelenideElement registerUserName = $("input#register-username-modal");
    public SelenideElement registerButtonOnFormRegistration = $("button[onclick=\"return register()\"]");
}
