package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {//"src/main/resources/feature/",
		"src/main/resources/feature/LoginMultiple.feature"
		},
glue = {"com/cts/steps"},monochrome = true//,dryRun = true//,
//tags = {"@valid"},
//plugin = {"html:reports/","pretty"}
)

@RunWith(Cucumber.class)
public class RunnerTest {

}
