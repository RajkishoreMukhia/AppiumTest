package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "./src/test/java/FeaturesFiles",
		glue = {"StepDefination"},
		monochrome = true,
		tags = "@smoke"

)

public class Runner extends AbstractTestNGCucumberTests{

}
