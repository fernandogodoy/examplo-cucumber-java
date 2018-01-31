package br.com.fsg.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubSearch {

	private WebDriver driver;

	public GitHubSearch(String link) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspaceFernando\\exemplo-cucumber-java\\src\\main\\resources\\win_chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(link);
	}

	public void close() {
		driver.close();
	}

	public boolean search(String text) {
		WebElement element = driver.findElement(By.name("q"));
		if (element != null) {
			element.sendKeys(text);
			element.submit();
			return true;
		}
		return false;
	}

	public boolean acessLink(String label) {
		WebElement element = driver.findElement(By.partialLinkText(label));
		if (element != null) {
			element.click();
			return true;
		}
		return false;
	}

	public String searchReadme() {
		WebElement element = driver.findElement(By.id("readme"));
		return element.getText().split("\n")[1];
	}

}
