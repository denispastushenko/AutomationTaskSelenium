import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features/",
        plugin = {"pretty", "html:src/test/resources/cucumber-html-report"},
        glue = "stepDefinition"
)

public class RunBDDTest{

}