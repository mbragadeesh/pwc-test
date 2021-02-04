package pwc.pages.serenitySteps;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;

@RunWith(SerenityRunner.class)
public class ContactUsSteps extends PageObject {

	//Click Contact Us Link by Text in Hamburger Menu Option in Home Page
	@Step
	public void click_link_by_text(String link) throws InterruptedException {
		getDriver().findElement(By.xpath("//a[contains(text(),'" + link + "')]")).click();

	}

	/* 1.Verify presence of links from Input data provider in Contact us Page
	 * 2. Retrieve the links in Contact Us using tag Name & extract the href value 
	 * 3. Compare href value from app with the data provider
	 * 4. Increment the counter, if match is found
	 */
	@Step
	public void verify_contact_us_links(DataTable contact_us_links) {

		int total_links_matched = 0;
		List<List<String>> links_to_verify = contact_us_links.raw();

		List<WebElement> linkList = getDriver().findElements(By.tagName("a"));
		for (int j = 1; j < links_to_verify.size(); j++) {
			loop: for (int i = 0; i < linkList.size(); i++) {
				try {
					if (linkList.get(i).getAttribute("href").contains(links_to_verify.get(j).get(1))) {
						total_links_matched++;
						break loop;
					}
				} catch (Exception e) {

				}
			}
		}

		if (total_links_matched == 4) {
			Assert.assertTrue("I am presented with the required links in Contact Us page", true);
		} else {
			Assert.assertTrue("I am presented with the required links in Contact Us page", false);

		}

	}

}