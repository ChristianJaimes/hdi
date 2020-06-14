package com.github.stepdefinitions.practica;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplicarStepDefinitions {
    @When("^cesar multiplica (\\d+) por (\\d+)$")
    public void cesarMultiplicaPor(int arg1, int arg2) {
        System.out.println("Multiplicar " + arg1 + " por " + arg2);
    }

    @Then("^cesar deberia ver que el resultado de la multiplicacion es (\\d+)$")
    public void cesarDeberiaVerQueElResultadoDeLaMultiplicacionEs(int arg1) {
        System.out.println("RESULTADO MULTIPLICACION " +  arg1);
    }
}
