package br.com.seleniumeasytest.jussara.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        monochrome = true,
        dryRun = false,
        glue = ""
)
public class RunCucumberTest{


}