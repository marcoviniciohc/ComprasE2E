package org.com.compras.software.steps;

import org.com.compras.software.pages.mapeos.AddToCartPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AddToCartSteps
{
    @Page
    private AddToCartPage addToCartPage;

    @Step("agregar producto A")
    public void addProductA()
    {
        addToCartPage.btnProductA.waitUntilClickable().click();
    }

    @Step("agregar producto B")
    public void addProductB()
    {
        addToCartPage.btnProductB.waitUntilClickable().click();
    }

    @Step("abrir carrito")
    public void openCart(){
        addToCartPage.btnopenCart.waitUntilClickable().click();
    }
}
