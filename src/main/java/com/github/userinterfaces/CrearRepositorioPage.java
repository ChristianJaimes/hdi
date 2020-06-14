package com.github.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearRepositorioPage {

    public static final Target NOMBRE_REPOSITORIO = Target.the("nombre del repositorio")
            .located(By.id("repository_name"));

    public static final Target DESCRIPCION_REPOSITORIO = Target.the("descripcion del repositorio")
            .located(By.id("repository_description"));

    public static final Target CREAR_REPOSITORIO = Target.the("boton crear repositorio")
            .locatedBy("div.js-with-permission-fields > .btn-primary");

    public static final Target MENSAJE_REPOSITORIO_YA_EXISTE = Target
            .the("Error message")
            .locatedBy(".error > strong");
}
