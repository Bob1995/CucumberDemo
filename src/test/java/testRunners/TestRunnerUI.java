package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", tags = "@Login")
public class TestRunnerUI extends AbstractTestNGCucumberTests {

}
