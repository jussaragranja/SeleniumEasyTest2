package br.com.seleniumeasytest.jussara.steps;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Driver;
import br.com.seleniumeasytest.jussara.support.Property;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static br.com.seleniumeasytest.jussara.support.Driver.getDriver;


/**
 * @author jussaragranja
 * Methods to be performed before and after testing
 */

public class Hooks extends PageBase {

	private static final String PRINT_PATH = "/src/test/resources/prints/";
	public static  Scenario scenario;

	@Before
    public void before(Scenario scenario) {
		Driver.driver = getDriver();
		Driver.driver.navigate().to(Property.URL);
		this.scenario = scenario;
	}
	  
	 @After
	 public void after() {
		 if(Driver.driver != null){
			 Driver.driver.quit();
		 }
		 Driver.driver = null;
	}

	public static void screenshot(){
		try{
			TakesScreenshot ts = (TakesScreenshot) getDriver();
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source, new File(new File("")
					.getAbsolutePath() +
					(PRINT_PATH + scenario.getName().toUpperCase() + "-" + RandomStringUtils.randomNumeric(5) + ".png")));
		} catch (IOException e){
			e.printStackTrace();
			Assert.fail("screenshot error");
		}
	}

}
