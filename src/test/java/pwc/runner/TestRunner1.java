
package pwc.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * Created by Bragadeesh Murthy - 03/02/2021
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "./resources/features/" },

		plugin = { "json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html", "pretty" }, glue = {
				"pwc.pages.stepDefinitions",
				"pwc.hooks" }, monochrome = true, strict = true, tags = { "@pwcTestChallenge" }

)
public class TestRunner1 {

}