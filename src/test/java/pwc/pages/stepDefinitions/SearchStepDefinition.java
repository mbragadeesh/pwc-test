package pwc.pages.stepDefinitions;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import pwc.pages.serenitySteps.SearchPageSteps;

public class SearchStepDefinition {

	@Steps
	SearchPageSteps search_page_steps;

	@And("^I enter the text \"([^\"]*)\" and search$")
	public void search(String text) throws Throwable {
		search_page_steps.search_Text(text);
	}

	@And("^I am presented with at least 1 search result$")
	public void verify_results() throws Throwable {
		search_page_steps.verify_search_results();
	}

}