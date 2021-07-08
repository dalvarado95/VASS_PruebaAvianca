#Author: Daniel Mauricio Alvarado Castro
  #Version: 1.0
  #FechaUltimaVersion: 07/07/2021

@Cucumber
Feature: Consultar Vuelos

  este feature se trata de validar escenarios de pruebas
  para la página avianca.

  @Regresion
  Scenario Outline: Validar Alerta Al No Ingresar Fecha Inicial
    Given Que Usuario entra en avianca
    When Usuario ingresa los siguientes datos de viaje: <vueloDesde> <vueloHacia>
    Then Usuario visualiza alerta: <mensaje>

    Examples:
      | Descripcion    | vueloDesde | vueloHacia | mensaje                                                |
      | Validar Alerta | Medellin   | Bogota     | Para continuar, por favor corregir el 1 error indicado |
      | Validar Alerta | Cucuta     | Bogota     | Para continuar, por favor corregir el 1 error indicado |
      | Validar Alerta | Bogota     | Cucuta     | Para continuar, por favor corregir el 1 error indicado |
      | Validar Alerta | Medellin   | Cucuta     | Para continuar, por favor corregir el 1 error indicado |
