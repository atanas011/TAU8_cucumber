package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"steps"}, features = "src/test/resources", plugin = {
        "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"})
public class RunCucumberTests {
    // to run parallel tests:
    // right toolbar > Maven > project > Lifecycle > test > Run
}
