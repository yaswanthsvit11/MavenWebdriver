package test;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {
	
	@Given("^I am a \"([a-zA-Z]{1,})\" Tester$")
	//public void manualTester(String testerType, DataTable data)
	public void manualTester(String testerType)
	{
//		List<Map<String,String>> dataValue= data.asMaps();
//		
//		//System.out.println(dataValue.get(0).ge);
//		System.out.println("--------------------------------");
//		System.out.println(testerType+" Tester "+dataValue.get(0).get("Location")+" "+dataValue.get(0).get("Position"));
//		System.out.println(testerType+" Tester "+dataValue.get(1).get("Location")+" "+dataValue.get(1).get("Position"));
		
		System.out.println("Tester Type"+ testerType);
	}
	
	@When("^I apply for a job$")
	public void applyJob()
	{
		System.out.println("Applied for Job");
	}
	
	@Then("^I got \"([a-zA-Z]{1,})\" paid job$")
	public void paidLess(String value)
	{
		System.out.println(value);
	}

	@And("^I am \"([a-zA-Z]{1,})\" satisfied with my salary$")
	public void notSatisfied(String checkValue)
	{
		System.out.println(checkValue);
	}
	
	@But("^my parents are \"([a-zA-Z]{1,})\" satisfied$")
	public void parents(String value)
	{
		System.out.println(value);
	}
}
