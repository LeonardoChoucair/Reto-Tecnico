package co.com.choucair.ejemplo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/retoTecnico.feature",
        glue = "co.com.choucair.ejemplo.stepdefinitions",
        tags = "@FullTest",
        snippets = SnippetType.CAMELCASE
)
public class RetoTecnicoRunner {
}
