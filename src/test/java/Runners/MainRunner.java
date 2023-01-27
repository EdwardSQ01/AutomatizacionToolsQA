package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautures"
        , glue = "Definitions"
        , tags = "@Prueba"
        , monochrome = true
        , snippets = SnippetType.CAMELCASE
)
public class MainRunner {

}
