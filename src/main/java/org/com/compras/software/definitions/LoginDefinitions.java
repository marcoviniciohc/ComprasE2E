package org.com.compras.software.definitions;

import org.com.compras.software.steps.LoginSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions
{

    @Steps
    private LoginSteps loginSteps;

    @Dado("que el usuario navega a la página de inicio de sesión")
    public void navegarPaginaInicioSesion() {
        loginSteps.openLoginPage();
        loginSteps.clearFieldsLogin();
    }

    @Cuando("ingresa las credenciales de acceso correctas")
    public void ingresaLasCredencialesDeAccesoCorrectas() 
    {
        loginSteps.enterCredentials("standard_user","secret_sauce");
        loginSteps.accessSystem();
    }

    @Entonces("debería ver la página principal")
    public void deberiaVerPaginaPrincipal()
    {
        loginSteps.validateSuccessfulLogin();

    }


}
