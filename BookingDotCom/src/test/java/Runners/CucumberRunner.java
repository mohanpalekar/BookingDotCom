package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions( features= {"src/test/resources/features"},
glue = {"stepDefinitions", "Hooks"},
tags = "@ParabankLogin or @ParaBankRegister",
dryRun = false,
monochrome = true, 
plugin = {"pretty", 
		"html:target/HTMLReports.html",
		"json:target/JSON/report.json",
		"junit:target/JNIT/reportJUnit.xml"})

public class CucumberRunner {

}
