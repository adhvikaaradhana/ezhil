package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/features",glue={"stepdefinitions"},
	plugin= {"pretty","html:target/cucumber-reports/report.html"},
	  monochrome=true)
	
	public class Testrunner
	{
		
		
	}

