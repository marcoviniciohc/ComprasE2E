package org.com.compras.software.steps;

import org.com.compras.software.pages.mapeos.CheckOutPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CheckOutSteps
{
    @Page
    private CheckOutPage checkOutPage;

    @Step("check out")
    public void btnCheckOut()
    {
        checkOutPage.btnCheckOut.waitUntilClickable().click();
    }

    @Step("enter Information")
    public void enterInformation(String firstname, String lastname, String postalcode)
    {
        checkOutPage.inputFirstname.type(firstname);
        checkOutPage.inputLastname.type(lastname);
        checkOutPage.inputPostalcode.type(postalcode);
    }

    @Step("continue")
    public void btnContinue()
    {
        checkOutPage.btnContinue.waitUntilClickable().click();
    }

    @Step("THANK YOU FOR YOUR ORDER")
    public void btnTankYou()
    {
        checkOutPage.btnTankYou.waitUntilClickable().click();
    }
}
