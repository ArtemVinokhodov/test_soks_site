package steps;

import elements.LogoutElement;

public class LogoutStep {
    LogoutElement logoutElement = new LogoutElement();
    public void logout(){
        logoutElement.logoutButton.click();
    }



}
