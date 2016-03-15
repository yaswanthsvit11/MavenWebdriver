package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.*;






@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",plugin=
{
		"pretty",
		"html:target/cucumber",
		"json:C:/Users/yaswa/.jenkins/jobs/CucumberMavenReporting/target"
})
public class TestRunner{

}
