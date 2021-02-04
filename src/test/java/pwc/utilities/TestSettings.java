package pwc.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestSettings {
	public static TestSettings instance;
	public static Properties configprop = new Properties();
	public static Properties serenityProp = new Properties();
	protected static FileOutputStream zo=null;

	static String root = System.getProperty("user.dir");

	public static TestSettings getInstance() {
		if (instance == null) {
			instance = new TestSettings();
		}
		return instance;
	}

	// ************LOAD Credentials Properties file
	public static void loadCredentialsProperties() {
		try {
			FileInputStream fs = new FileInputStream(root + "/configuration/Config.properties");
			configprop.load(fs);
			FileInputStream sp = new FileInputStream(root + "/serenity.properties");
			serenityProp.load(sp);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TestSettings() {
		loadCredentialsProperties();
	}

	public Properties getConfigProp() {
		return configprop;
	}

	public Properties getsernityProp() {
		return serenityProp;
	}
	

	public static void main(String[] args) throws IOException {
		TestSettings ts = TestSettings.getInstance();
	}
}
