package pwc.utilities;

import java.io.IOException;
import java.util.Properties;

import net.thucydides.core.pages.PageObject;

public class CommonFunctions extends PageObject {

	public Properties testDataProp = new Properties();
	String root = System.getProperty("user.dir");
	TestSettings ts = TestSettings.getInstance();
	Properties config = ts.getConfigProp();


	// *****Common Functions for the application***************************************/


	public void launch_URL() throws IOException {
		try {

			String thisURL = config.getProperty("APP_URL");
			getDriver().get(thisURL);
		} catch (Exception e) {

		}
	}

	
}
