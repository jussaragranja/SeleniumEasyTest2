package br.com.seleniumeasytest.jussara.steps;

import br.com.seleniumeasytest.jussara.page.PageBase;
import br.com.seleniumeasytest.jussara.support.Driver;
import br.com.seleniumeasytest.jussara.support.Property;
import io.cucumber.java.After;
import io.cucumber.java.Before;


/**
 * @author jussaragranja
 * Methods to be performed before and after testing
 */

public class Hooks extends PageBase {

	@Before
    public void before() throws InterruptedException {
		Driver.driver = Driver.getDriver();
		Driver.driver.navigate().to(Property.URL);
	}
	  
	 @After
	 public void after() {
		 if(Driver.driver != null){
			 Driver.driver.quit();
		 }
		 Driver.driver = null;
	  }

}
