package runner;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = "com.stepDefinition",
		plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
)
public class TestRunner {
	
}
