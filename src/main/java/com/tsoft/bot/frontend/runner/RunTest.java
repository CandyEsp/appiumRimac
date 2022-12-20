package com.tsoft.bot.frontend.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;


@CucumberOptions(
		features={"src//main//resources//features"},
		glue={"com.tsoft.bot.frontend.steps.APP_MiMovistar","com.tsoft.bot.frontend.helpers"
				,"com.tsoft.bot.frontend.steps.APP_RIMAC"},
		plugin = {"pretty", "html:target/cucumber"},
		tags = {"@RIMAC"},
		monochrome = true
	)

@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
