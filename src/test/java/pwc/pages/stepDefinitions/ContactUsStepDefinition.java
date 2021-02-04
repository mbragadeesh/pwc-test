package pwc.pages.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pwc.pages.serenitySteps.ContactUsSteps;

public class ContactUsStepDefinition {

	@Steps
	ContactUsSteps contact_us_steps;

	@When("^I select \"([^\"]*)\" from the hamburger menu$")
	public void contact_us_navigation(String link) throws Exception {
		contact_us_steps.click_link_by_text(link);
	}

	@And("^I am presented with the below options for contacts$")
	public void verify_contact_us(DataTable contact_us_links) throws Throwable {
		contact_us_steps.verify_contact_us_links(contact_us_links);

	}
}