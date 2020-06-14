package com.github.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.thucydides.core.webdriver.SerenityWebdriverManager;

import static com.github.tasks.Autenticar.USUARIO;
import static com.github.tasks.CrearRepositorio.REPOSITORIO;

@Subject("El repositorio fue creado")
public class ElRepositorio implements Question<Boolean> {

    private static final String FORMATO_URL = "https://github.com/%s/%s";

    @Override
    public Boolean answeredBy(Actor actor) {
        String espectativaUrl = obtenerUrlEsperada(actor);
        String urlActual = obtenerUrlActual();
        System.out.println("**** esperada ----> " + espectativaUrl);
        System.out.println("****Actual ----> " + urlActual);
        return espectativaUrl.equals(urlActual);
    }

    private String obtenerUrlEsperada(Actor actor) {
        String usuario = actor.recall(USUARIO);
        String repositorio = actor.recall(REPOSITORIO);
        return String.format(FORMATO_URL, usuario, repositorio);
    }

    private String obtenerUrlActual() {
        return SerenityWebdriverManager.inThisTestThread().getCurrentDriver().getCurrentUrl();
    }

    public static ElRepositorio fueCreado() {
        return new ElRepositorio();
    }
}
