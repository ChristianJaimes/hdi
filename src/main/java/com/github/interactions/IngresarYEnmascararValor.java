package com.github.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.Arrays;

public class IngresarYEnmascararValor extends EnterValue {

    private String texto;
    private Target elemento;

    public IngresarYEnmascararValor(String texto, Target elemento) {
        super(texto);
        this.texto = texto;
        this.elemento = elemento;
    }

    @Override
    @Step("{0} ingreso ****** en el campo #elemento")
    public <T extends Actor> void performAs(T actor) {
        elemento.resolveFor(actor).type(texto);
        if(getFollowedByKeys().length > 0){
            Arrays.asList(getFollowedByKeys()).forEach(keys -> elemento.resolveFor(actor).sendKeys(keys));
        }
    }
}
