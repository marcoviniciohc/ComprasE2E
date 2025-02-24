package org.com.compras.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.saucedemo.com/inventory.html")
public class MainPage extends PageObject {

    @FindBy(xpath = "//body//span")
    public WebElementFacade txtTitleMainPage;

}
