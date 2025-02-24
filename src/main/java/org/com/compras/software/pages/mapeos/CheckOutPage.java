package org.com.compras.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.saucedemo.com/cart.html")
public class CheckOutPage extends PageObject
{
        @FindBy(id = "checkout")
        public WebElementFacade btnCheckOut;

        @FindBy(id = "first-name")
        public WebElementFacade inputFirstname;

        @FindBy(id = "last-name")
        public WebElementFacade inputLastname;

        @FindBy(id = "postal-code")
        public WebElementFacade inputPostalcode;

        @FindBy(id = "continue")
        public WebElementFacade btnContinue;

        @FindBy(id = "finish")
        public WebElementFacade btnTankYou;
}
