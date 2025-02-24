package org.com.compras.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name='user-name']")
    public WebElementFacade inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElementFacade inputPassword;

    @FindBy(id = "login-button")
    public WebElementFacade btnLogin;
}
