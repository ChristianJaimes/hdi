package com.github.stepdefinitions.practica;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SumarStepDefinitions {

    private static final String FORMATO_SUMA = "SUMA DE %d y %d";

    @Before
    public void prepararEscenario(){
        System.out.println("PREPARACION DEL ESCENARIO");
    }

    @Given("^[a-zA-Z]{3,40} quiere realizar una operacion matematica$")
    public void realizarUnaOperacionMatematica() {
        System.out.println("REALIZAR ");
    }

    @When("^[a-zA-Z]{3,40} suma (-?\\d+) mas (-?\\d+)$")
    public void sumar(int numeroUno, int numeroDos) {
        System.out.println(String.format(FORMATO_SUMA, numeroUno, numeroDos));
    }

    @Then("^[a-zA-Z]{3,40} deberia ver que el resultado es (-?\\d+)$")
    public void verificarSuma(int resultado) {
        System.out.println("RESULTADO " + resultado);
    }

    @After
    public void bajarElTelon(){
        System.out.println("BAJAR EL TELON");
    }
}
