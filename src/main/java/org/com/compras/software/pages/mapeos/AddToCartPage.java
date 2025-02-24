package org.com.compras.software.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://www.saucedemo.com/inventory.html")
public class AddToCartPage extends PageObject
{

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElementFacade btnProductA;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElementFacade btnProductB;

    @FindBy(id = "shopping_cart_container")
    public WebElementFacade btnopenCart;
}
