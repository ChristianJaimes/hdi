package com.github.tasks;

import com.github.interactions.IngresarYEnmascarar;
import com.github.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.github.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autenticar implements Task {

    public static final String USUARIO = "USUARIO";
    private Usuario usuario;

    public Autenticar(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    @Step("{0} realiza la autenticacion con #usuario")
    public <T extends Actor> void performAs(T actor) {
        actor.remember(USUARIO, usuario.getUsuario());
        actor.attemptsTo(
                Enter.theValue(usuario.getUsuario()).into(NOMBRE_USUARIO),
                IngresarYEnmascarar.elTexto(usuario.getContrasena()).en(CONTRASENA),
                Click.on(BOTON_INGRESAR)
        );
    }

    public static Autenticar al(Usuario usuario) {
        return instrumented(Autenticar.class, usuario);
    }

}
