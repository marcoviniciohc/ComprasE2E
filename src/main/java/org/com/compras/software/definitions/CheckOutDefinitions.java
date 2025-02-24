package org.com.compras.software.definitions;

import org.com.compras.software.steps.CheckOutSteps;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class CheckOutDefinitions
{

    @Steps
    private CheckOutSteps checkOutSteps;


    @Y("check out")
    public void checkOut ()
    {
        checkOutSteps.btnCheckOut();
    }

    @Y("completar formulario")
    public void agregarProducto()
    {
        checkOutSteps.enterInformation("Marco", "Herrera", "170103");
    }

    @Y("finalizar compra")
    public void finalizarCompra()
    {
        checkOutSteps.btnContinue();
    }
    @Entonces("THANK YOU FOR YOUR ORDER")
    public void tankYou()
    {
        checkOutSteps.btnTankYou();
    }

}
