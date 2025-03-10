package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinition", "hooks" }, tags = "@rediff", plugin = {
		"pretty", "html:src/main/resources/Reports/cucumber-reports/CucumberTestReport.html",
		"json:src/main/resources/Reports/cucumber-reports/CucumberTestReport.json",
		"rerun:src/main/resources/Reports/cucumber-reports/rerun.txt" })

public class RediffRunner extends AbstractTestNGCucumberTests {

}
