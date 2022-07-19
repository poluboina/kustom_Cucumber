package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
features = "src/main/resources/features",
glue = "stepdefinition",
tags = "@SmokeScenario",
plugin = {"pretty", "html:target/cucuReport.html"},
monochrome = true
)
public class TestRunner {

}
