package com.github.stepdefinitions.repositorio;

import com.github.models.Repositorio;
import com.github.models.Usuario;
import com.github.questions.ElRepositorio;
import com.github.tasks.Autenticar;
import com.github.tasks.CrearRepositorio;
import com.github.userinterfaces.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.github.models.RepositorioBuilder.nombre;
import static com.github.userinterfaces.HomePage.BOTON_NUEVO_REPOSITORIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearRepositorioStepDefinitions {

    private LoginPage loginPage;

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) esta autenticado$")
    public void christian_esta_autenticado(String nombre, List<String> credenciales) {
        theActorCalled(nombre).wasAbleTo(
                Open.browserOn(loginPage),
                Autenticar.al(Usuario.con(credenciales))
        );
    }

    @When("^[a-zA-z]{3,40} crea un repositorio$")
    public void christian_crea_un_repositorio() {
        // new Repositorio("prueba")
        /*
        nombre("prueba")
                .descripcion("un repositorio de prueba")
                */
        // Repositorio.conNombre("") import Class
        // conNombre("") import static
        theActorInTheSpotlight().attemptsTo(
                Click.on(BOTON_NUEVO_REPOSITORIO),
                CrearRepositorio.conLaSiguienteInformacion(
                        nombre("prueba")
                                .descripcion("un repositorio de prueba")
                )
        );
    }

    @Then("^[a-zA-z]{3,40} debe ver la pagina del nuevo repositorio$")
    public void christian_debe_ver_la_pagina_del_nuevo_repositorio() {
        theActorInTheSpotlight().should(seeThat(ElRepositorio.fueCreado()));
    }

}
