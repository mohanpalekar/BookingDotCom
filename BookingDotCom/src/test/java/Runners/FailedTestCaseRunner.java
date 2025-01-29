package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features= {"@target/rerun.txt"},
glue = {"stepDefinitions", "Hooks"},
tags = "",
dryRun = false,
monochrome = true, 
plugin = {"pretty", 
		"html:target/HTMLReports.html",
		"json:target/JSON/report.json",
		"junit:target/JNIT/reportJUnit.xml",
		"rerun:target/finalFailed.txt"})
public class FailedTestCaseRunner {

}
