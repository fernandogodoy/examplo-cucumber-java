Feature: Search github project

	Scenario: Search project example
		Given I can access the site "http://www.github.com"
		When I search project with name "exemplo-cucumber-java"
		And I should find with description "fernandogodoy/exemplo-cucumber-java"
		Then I should view the text "Exemplo de BDD: Java + Junit + Selenium + Cucumber"