package br.com.seleniumeasytest.jussara.support;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

/**
* @author jussaragranja
* Driver directories
* and access to config.properties
*/

public abstract class Property {

	public static String CHROME_DRIVE_PATH;
	public static String CHROME_DRIVE_LINUX_PATH;
	public static String BROWSER_NAME;
	public static String URL;
	public static String GRIDURL;
	private static final String PROP_FILE_CONFIG = "config.properties";
	private static final String SRC_SELENIUM = "/src/test/resources/";

	public static Properties getConfig(){
		Properties properties = new Properties();
		InputStream fileIn = ClassLoader.getSystemResourceAsStream(PROP_FILE_CONFIG);
		try {
			properties.load(fileIn);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return properties;
	}
	
	static{
		Properties properties 					= getConfig();
		CHROME_DRIVE_PATH 						= new File("").getAbsolutePath() + SRC_SELENIUM + "driver/windows/chromedriver.exe";
		CHROME_DRIVE_LINUX_PATH 				= new File("").getAbsolutePath() + SRC_SELENIUM + "driver/linux/chromedriver";
		BROWSER_NAME 							= properties.getProperty("browser.name");
		URL										= properties.getProperty("url");
		GRIDURL									= properties.getProperty("gridurl");
	}

}
