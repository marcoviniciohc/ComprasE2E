package org.com.compras.software.definitions;

import org.com.compras.software.steps.AddToCartSteps;
//import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class AddToCartDefinitions
{

    @Steps
    private AddToCartSteps addToCartSteps;


    @Y("que el usuario selecciona productos")
    public void seleccionaProductos()
    {
        addToCartSteps.addProductA();
    }

    @Y("agrega producto")
    public void agregarProducto()
    {
        addToCartSteps.addProductB();
    }

    @Y("ver productos")
    public void verProductos()
    {
        addToCartSteps.openCart();
    }
}
