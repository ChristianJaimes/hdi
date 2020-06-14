package com.github.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/github/crear_repositorio.feature"},
        glue = {"com.github.stepdefinitions.repositorio"},
        snippets = SnippetType.CAMELCASE
)
public class CrearRepositorio {
}
