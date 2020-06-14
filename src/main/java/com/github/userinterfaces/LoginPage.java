package com.github.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://github.com/login")
public class LoginPage extends PageObject {

    public static final Target NOMBRE_USUARIO = Target.the("Nombre de usuario")
            .located(By.id("login_field"));

    public static final Target CONTRASENA = Target.the("Contrasena")
            .locatedBy("//input[@id='password']");

    public static final Target BOTON_INGRESAR = Target.the("Ingresar")
            .located(By.name("commit"));

}
