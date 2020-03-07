package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/feature/GoogleMap.feature",
		//"src/main/resources/feature/GoogleMap.feature"
		},
glue = {"com/cts/stepdefintions"},monochrome = true,//dryRun = true,
//tags = {"@valid"},
plugin = {"html:reports/","pretty"}
)

@RunWith(Cucumber.class)
public class RunnerTest {

}
