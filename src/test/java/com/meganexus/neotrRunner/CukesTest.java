package com.meganexus.neotrRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/" }, tags = { "@Referral" }, glue = {
		"com.meganexus.stepDefs" }, format = { "html:target/cucumber-report", "json:target/json/output.json" })
public class CukesTest {
	

}
