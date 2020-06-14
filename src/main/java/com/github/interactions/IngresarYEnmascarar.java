package com.github.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarYEnmascarar {

    private final String texto;

    public IngresarYEnmascarar(String texto) {
        this.texto = texto;
    }

    public IngresarYEnmascararValor en(Target elemento){
        return instrumented(IngresarYEnmascararValor.class,texto, elemento);
    }

    public static IngresarYEnmascarar elTexto(String texto){
        return new IngresarYEnmascarar(texto);
    }
}
