package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= "./src/main/java/feature/Login.feature", 
				glue = "cucumber",
				monochrome=true, tags = {"@Sanity"},
				strict=true)

public class RunCoke {

	}
