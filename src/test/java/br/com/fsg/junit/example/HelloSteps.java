package br.com.fsg.junit.example;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloSteps {

	private Hello hello;
	private String text;

	@Given(value = "^I can say (.*)$")
	public void sayHello(String text) {
		hello = new Hello(text);
	}

	@When("^The application is started")
	public void startedApplication() {
		text = hello.getText();
	}
	
	@Then("^(.*), welcome to cucumber with java example$")
	public void grettingApplication(String expected) {
		assertEquals(expected , text);
	}
}
