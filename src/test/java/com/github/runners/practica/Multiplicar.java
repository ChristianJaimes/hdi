package com.github.runners.practica;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/practica/multiplicar.feature"},
        glue = {"com.hdi.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class Multiplicar {
}