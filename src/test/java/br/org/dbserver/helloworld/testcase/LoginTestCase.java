package br.org.dbserver.helloworld.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.org.dbserver.helloworld.verificationpoints.LoginVerificationPoints;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {

	private WebDriver driver;
	private LoginVerificationPoints verificationpoints;

	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();

		this.driver = new FirefoxDriver();
		this.driver.get("https://demo.virtuemart.net/");
		this.verificationpoints = new LoginVerificationPoints(driver);

	}

	@Test
	public void testMain() {

		String user = "demo";
		String passw = "demo";

		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		WebElement submitButton = this.driver.findElement(By.name("Submit"));

		usernameTextField.sendKeys(user);
		passwordTextField.sendKeys(passw);

		submitButton.click();

		verificationpoints.checkHelloUserMessage();
	}

	@After
	public void tearDown() {
		this.driver.quit();

		// Quit - fecha o webdriver
		// Close - fecha o navegador

	}

}
