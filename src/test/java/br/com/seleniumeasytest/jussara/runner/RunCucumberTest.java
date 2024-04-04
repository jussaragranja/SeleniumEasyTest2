package br.com.seleniumeasytest.jussara.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/inputforms/checkbox.feature",
        monochrome = true,
        dryRun = false,
        glue = "",
        plugin = { "json:target/cucumber.json", "pretty",
                "html:target/cucumber-reports" }
)
public class RunCucumberTest{


}