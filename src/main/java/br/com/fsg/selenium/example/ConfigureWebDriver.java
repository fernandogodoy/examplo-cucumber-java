package br.com.fsg.selenium.example;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigureWebDriver {

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static WebDriver getWebDriverInstance() {
		ConfigureWebDriver configureWebDriver = new ConfigureWebDriver();
		Path path = configureWebDriver.getBinaryPath();
		
		System.setProperty("webdriver.chrome.driver", path.toString());
		return new ChromeDriver();
	}

	private Path getBinaryPath() {
		switch (OS) {
		case "windows 10":
			return Paths.get("src/main/resources/win_chromedriver.exe");
		default:
			return Paths.get("src/main/resources/lin_chromedriver");
		}
	}

}
