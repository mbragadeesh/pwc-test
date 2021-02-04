package pwc.pages.serenitySteps;

import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import cucumber.api.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import pwc.utilities.CommonFunctions;

@RunWith(SerenityRunner.class)
public class HomePageSteps extends PageObject {

	CommonFunctions common_functions;

	// Launch application URL
	@Step
	public void launch_pwc_app() throws IOException {

		common_functions.launch_URL();
	}

	/*
	 * 1. Verify presence of 3 Carousel articles based on Contains text from Input
	 * Data Provide 2. Increment the counter, if match is found
	 */
	@Step
	public void verify_carousel_articles(DataTable articles) {
		List<List<String>> data = articles.raw();
		int article_counter = 0;

		for (int i = 1; i < data.size(); i++) {
			String articles_input = data.get(i).get(0);
			System.out.println("Input Article " + articles_input);
			boolean present = getDriver().findElement(By.xpath("//h2[contains(text(),'" + articles_input + "')]"))
					.isEnabled();
			if (present == true) {
				article_counter++;
			}

		}

		if (article_counter == 3) {
			Assert.assertTrue("I am presented with a carousel displaying 3 featured articles", true);
		} else {
			Assert.assertTrue("I am presented with a carousel displaying 3 featured articles", false);

		}
	}

	// Navigation in the Carousel
	@Step
	public void click_carousel_button(String button) throws InterruptedException{

		if (button.equalsIgnoreCase("Next")) {
			getDriver().findElement(By.className("flex-next")).click();
			Thread.sleep(2000);
		} else {
			getDriver().findElement(By.className("flex-prev")).click();
			Thread.sleep(2000);
		}
	}

	@Step
	public void click_on_hamburger_menu() throws InterruptedException {
		getDriver().findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div/i[1]")).click();
		Thread.sleep(2000);
	}

	@Step
	public void click_magnifying_icon(String icon) throws InterruptedException {
		getDriver().findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div/i[2]")).click();
		Thread.sleep(2000);

	}

}