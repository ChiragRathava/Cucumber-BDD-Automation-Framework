package com.chiragrathava.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featureFiles"},
        glue = {"com.chiragrathava.stepdefinitions"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "json:build/cucumber-reports/cucumber.json",
                "html:build/cucumber-reports/html-report",
                "rerun:build/cucumber-reports/rerun.txt"
        }
)
public class TestRunner {
}
