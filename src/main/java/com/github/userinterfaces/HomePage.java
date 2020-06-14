package com.github.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BOTON_NUEVO_REPOSITORIO = Target.the("nuevo repositorio")
            .located(By.linkText("New"));
}
