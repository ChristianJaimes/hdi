package com.github.tasks;

import com.github.exceptions.RepositorioYaExisteError;
import com.github.models.Repositorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import static com.github.userinterfaces.CrearRepositorioPage.*;
import static com.github.utils.ValidadorString.noEsVacioONull;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CrearRepositorio implements Task {

    public static final String REPOSITORIO = "REPOSITORIO";
    private Repositorio repositorio;

    public CrearRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(REPOSITORIO, repositorio.getNombre());
        actor.attemptsTo(
                Enter.theValue(repositorio.getNombre()).into(NOMBRE_REPOSITORIO)
        );

        actor.should(seeThat(the(MENSAJE_REPOSITORIO_YA_EXISTE), isNotVisible())
                .orComplainWith(RepositorioYaExisteError.class, "EL repositorio " + repositorio.getNombre() + " ya existe."));

        /*
        if(noEsVacioONull(repositorio.getDescripcion())){
            actor.attemptsTo(
                    Enter.theValue(repositorio.getDescripcion()).into(DESCRIPCION_REPOSITORIO)
            );
        }*/

        actor.attemptsTo(
                Check.whether(noEsVacioONull(repositorio.getDescripcion()))
                        .andIfSo(Enter.theValue(repositorio.getDescripcion()).into(DESCRIPCION_REPOSITORIO)),
                Click.on(CREAR_REPOSITORIO)
        );
    }

    public static CrearRepositorio conLaSiguienteInformacion(Repositorio repositorio) {
        return instrumented(CrearRepositorio.class, repositorio);
    }
}
