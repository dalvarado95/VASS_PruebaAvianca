package com.avianca.steps;

import net.thucydides.core.annotations.Step;
import com.avianca.pages.*;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class StepsAvianca {

    AviancaPaginaHome aviancaPaginaHome;

    @Step("#actor ingresa a avianca")
    public void ingresa_a_avianca() {
        aviancaPaginaHome.setDefaultBaseUrl("https://www.avianca.com/co/es/");
        aviancaPaginaHome.open();
    }

    @Step("#actor ingresa datos vuelo")
    public void ingresa_datos_vuelo(String vueloDesde,String vueloHacia){
        aviancaPaginaHome.ClickEnSoloIda();
        aviancaPaginaHome.IngresarDatosVuelo(vueloDesde,vueloHacia);
    }

    @Step("#actor valida mensaje alerta")
    public void valida_mensaje_alerta(String Mensaje) {
        String mensajeConfirmacion = aviancaPaginaHome.ValirdarMensajeAlerta();
        System.out.println(mensajeConfirmacion);
        System.out.println(Mensaje);
        assertThat(mensajeConfirmacion, Matchers.containsString(Mensaje));
    }

}
