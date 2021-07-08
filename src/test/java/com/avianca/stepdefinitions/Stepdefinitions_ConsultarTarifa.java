package com.avianca.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.avianca.steps.StepsAvianca;
import net.thucydides.core.annotations.Steps;

public class Stepdefinitions_ConsultarTarifa {

    @Steps(shared = true)
    StepsAvianca usuario;

    @Given("^Que Usuario entra en avianca$")
    public void ingresa_a_avianca() {
        usuario.ingresa_a_avianca();
    }

    @When("^Usuario ingresa los siguientes datos de viaje: (.*) (.*)$")
    public void ingresa_datos_de_viaje(String vueloDesde, String vueloHacia) {
        usuario.ingresa_datos_vuelo(vueloDesde,vueloHacia);
    }

    @Then("^Usuario visualiza alerta: (.*)")
    public void valida_mensaje_alerta(String mensaje) {
        usuario.valida_mensaje_alerta(mensaje);
    }

}
