package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"steps"}, features = "src/test/resources", plugin = {
        "pretty", "html:target/reports/report.html", "json:target/cucumber.json"})
public class RunCucumberTests {
    // to get an html report in target/reports:
    //   right toolbar > Maven > project > Lifecycle > test > Run...
}
