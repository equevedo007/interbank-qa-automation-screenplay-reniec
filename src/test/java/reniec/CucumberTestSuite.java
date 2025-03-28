package reniec;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "reniec.stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-report.json"}
)
public class CucumberTestSuite {
}
