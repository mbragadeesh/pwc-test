package pwc.pages.stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pwc.pages.serenitySteps.HomePageSteps;

public class HomePageStepDefinition {

	@Steps
	HomePageSteps home_page_steps;

	@Given("^I navigate to the PwC Digital Pulse website$")
	public void launch_app() throws Exception {
		home_page_steps.launch_pwc_app();
	}

	@Then("^I am presented with a carousel displaying 3 featured articles$")
	public void verify_articles(DataTable articles) throws Throwable {
		home_page_steps.verify_carousel_articles(articles);
	}

	@And("^click on \"([^\"]*)\" button$")
	public void carousel_button(String button) throws Throwable {
		home_page_steps.click_carousel_button(button);
	}

	@Then("^click on hamburger menu$")
	public void click_hamburger() throws Exception {
		home_page_steps.click_on_hamburger_menu();
	}

	@When("^I click on the \"([^\"]*)\" icon to perform a search$")
	public void click_magnifying_icon(String icon) throws Throwable {
		home_page_steps.click_magnifying_icon(icon);
	}

}