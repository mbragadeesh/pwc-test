package pwc.hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Managed;
import pwc.utilities.TestSettings;

public class Hooks {

	@Managed(uniqueSession = true, driver = "chrome")
	WebDriver driver;
	public static TestSettings testSettings;
	public static Properties credentials;
	String root = System.getProperty("user.dir");
	public static Properties CONFIG = null;

	public Hooks() {
		System.out.println("--------------------INITIALIZE HOOKS----------------------");
		testSettings = TestSettings.getInstance();
		credentials = testSettings.getConfigProp();
	}

	@Before
	public void BeforeScenario() throws IOException {
		System.out.println("--------------------BEFORE SCENARIO----------------------");
		CONFIG = new Properties();
		FileInputStream fs = new FileInputStream(root + "/configuration/CONFIG.properties");
		CONFIG.load(fs);
		System.setProperty("webdriver.chrome.driver", (root + CONFIG.getProperty("Chrome_Driver_Path")));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void AfterScenario() {
		System.out.println("--------------------AFTER SCENARIO----------------------");
		driver.quit();
	}

}
