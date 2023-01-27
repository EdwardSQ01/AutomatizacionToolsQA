package Definitions;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.When;
import Steps.RegisterFormToolsQASteps;

import java.io.IOException;

public class RegisterFormToolsQADefinitions {

    @Steps
    RegisterFormToolsQASteps registerFormToolsQASteps;

    public RegisterFormToolsQADefinitions() {
        this.registerFormToolsQASteps = new RegisterFormToolsQASteps();
    }

    @Given("^Ingreso al sitio web (.*)$")
    public void ingresoPaginaToolsQA(String url) throws IOException {
        registerFormToolsQASteps.ingresoPaginaToolsQA(url);
    }

    @When("^Completo los campos del formulario(.*),(.*),(.*),(.*)$")
    public void ingresoDatosFormulario(String Nombre, String Apellido, String Email, String UserNumber) {
        registerFormToolsQASteps.ingresoDatosFormulario(Nombre, Apellido, Email, UserNumber);

    }


}
