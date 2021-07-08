package com.avianca.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;

public class AviancaPaginaHome extends PageObject{

    @FindBy(xpath = "(//div[@data-flight='noMD']/div/label/div/input[contains(@id,'pbOrigen_') and contains(@data-msg,'Selecciona un origen')])[3]")
    WebElement txtVueloDesde;

    @FindBy(xpath = "(//div[@data-flight='noMD']/div/label/div/input[contains(@id,'pbDestino_') and contains(@data-msg,'Selecciona un destino')])[3]")
    WebElement txtVueloHacia;

    @FindBy(xpath = "(//button[@class='btn primary btn-codepromo pull-btn rojo'][contains(.,'Buscar vuelos')])[2]")
    WebElement btnBuscarVuelo;

    @FindBy(xpath = "//a[@role='presentation'][contains(.,'Solo ida')]")
    WebElement lnkSoloIda;

    @FindBy(xpath = "//h3[contains(@id,'titleError-booking2-')]")
    WebElement lblAlertaError;

    public void ClickEnSoloIda(){
        lnkSoloIda.click();
    }

    public void IngresarDatosVuelo(String vueloDesde, String vueloHacia){
        txtVueloDesde.click();
        txtVueloDesde.sendKeys(vueloDesde);
        txtVueloDesde.sendKeys(Keys.ARROW_DOWN);
        txtVueloDesde.sendKeys(Keys.ENTER);
        txtVueloHacia.click();
        txtVueloHacia.sendKeys(vueloHacia);
        txtVueloHacia.sendKeys(Keys.ARROW_DOWN);
        txtVueloHacia.sendKeys(Keys.ENTER);
        btnBuscarVuelo.click();
    }

    public String ValirdarMensajeAlerta(){
        return lblAlertaError.getText();
    }

}
