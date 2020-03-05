package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Basanthi\\Selenium\\Practice\\bdd-framework\\src\\test\\java\\features\\login.feature", glue = {
		"steps" }, dryRun = false, 
				monochrome = true,
				plugin = { "pretty", "html:test-output" })

public class loginRunner {

}
