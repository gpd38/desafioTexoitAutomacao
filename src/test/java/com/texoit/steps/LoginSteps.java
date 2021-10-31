package com.texoit.steps;

import com.texoit.core.Driver;
import com.texoit.enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;

import java.io.IOException;

public class LoginSteps {

    @Before
    public void iniciaNavegador(Scenario cenario){
        new Driver(Browser.CHROME);
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();
    }

    @After
    public void fechaNavegador(Scenario cenario) throws IOException {
        if (cenario.isFailed()){
            Driver.printScreen("erro no cenario");
        }
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("http://automationpractice.com/index.php");

    }

}