package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginElements {
    public SelenideElement inputUsername = $("input[id=\"username-modal\"]");
    public SelenideElement loginButton = $("button[onclick=\"return login()\"]");
}
