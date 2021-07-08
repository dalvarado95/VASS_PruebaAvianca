package com.avianca.run;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = { "com.avianca.stepdefinitions" },
        plugin = {"pretty"},
        features = {
                "src/test/resources/features/"},
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class CuandoPrueboAvianca {

    public static void main(String[] args) {

    }

}