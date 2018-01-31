package br.com.fsg.selenium.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubSteps {

	private GitHubSearch git;
	
	@Given("^I can access the site \"(.*)\"$")
	public void openWebSite(String link) {
		git = new GitHubSearch(link);
	}
	
	@When("^I search project with name \"(.*)\"$")
	public void search(String text) {
		assertTrue(git.search(text));
	}
	
	@And("^I should find with description \"(.*)\"$")
	public void accessLink(String label) {
		assertTrue(git.acessLink(label));
	}
	
	@Then("I should view the text \"(.*)\"")
	public void projectFound(String description) {
		String searchText = git.searchReadme();
		assertEquals(description, searchText);
	}
	
	@cucumber.api.java.After
	public void endTest() {
		git.close();
	}
}
