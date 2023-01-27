package Steps;

import Definitions.Hooks;
import PageObjects.RegisterFormToolsQAPO;
import PageObjects.WebBasePage;
import org.junit.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class RegisterFormToolsQASteps {

    RegisterFormToolsQAPO registerFormToolsQAPO;

    public RegisterFormToolsQASteps() {
        this.registerFormToolsQAPO = new RegisterFormToolsQAPO();
        registerFormToolsQAPO.setDriver(Hooks.getDriver());


    }

    public void ingresoPaginaToolsQA(String url) throws IOException {
        Properties propiedades = new Properties();
        propiedades.load(new FileReader("configuration.properties"));
        String urlPage = propiedades.getProperty(url);
        registerFormToolsQAPO.openPageToolsQA(urlPage);

    }

    public void ingresoDatosFormulario(String nombre, String apellido, String email, String usernumber) {
        registerFormToolsQAPO.sendKeysInputFirstName(nombre);
        registerFormToolsQAPO.sendKeysInputLastName(apellido);
        registerFormToolsQAPO.sendKeysInputEmail(email);
        registerFormToolsQAPO.clickRadioButtonMale();
        registerFormToolsQAPO.sendKeysUserNumber(usernumber);
        registerFormToolsQAPO.sendKeysinputSubjects();
        registerFormToolsQAPO
    }
}
