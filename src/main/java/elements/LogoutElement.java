package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LogoutElement {
    public SelenideElement logoutButton = $("a[onclick=\"logout()\"]");
}
