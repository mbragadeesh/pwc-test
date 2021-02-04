package pwc.pages.serenitySteps;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import pwc.utilities.CommonFunctions;

@RunWith(SerenityRunner.class)
public class SearchPageSteps extends PageObject {

	CommonFunctions common_functions;

	@Step
	public void search_Text(String text) {
		getDriver().findElement(By.id("search-input")).sendKeys(text);
		getDriver().findElement(By.id("search-input")).sendKeys(Keys.ENTER);

	}

	@Step
	public void verify_search_results() {
		String url = "";
		List<WebElement> results = getDriver().findElements(By.xpath("//h2/a[@href]"));
		System.out.println("size " + results.size());
		Iterator<WebElement> iterator = results.iterator();
		while (iterator.hasNext()) {

			url = iterator.next().getText();
			System.out.println("links" + url);
			if (results.size() > 1) {
				Assert.assertTrue("Number of search results displayed is greater than 1", true);
			} else {
				Assert.assertTrue("Number of search results displayed is greater than 1", false);

			}
		}

	}

}