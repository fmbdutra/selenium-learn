package br.org.dbserver.helloworld.testcase;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	
	private WebDriver driver;
	
	
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		
		this.driver = new FirefoxDriver();
		
		this.driver.get("https://demo.virtuemart.net/");
		
		
		
	}
	
	
	@Test
	public void testMain() {			
		WebElement usernameTextField = this.driver.findElement(By.id("modlgn-username"));
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		WebElement submitButton = this.driver.findElement(By.name("Submit"));
		
		usernameTextField.sendKeys("demo");
		passwordTextField.sendKeys("demo");
		
		
		submitButton.click();
		/*
		if(this.driver.getPageSource().contains("")) {
			System.out.println("Entrou");
			
		}	
		
		else {
			System.out.println("Não encontrou");
		}
		*/
		assertTrue(this.driver.getPageSource().contains("Hi demo"));
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
		
		/*
		 * Quit - fecha o webdriver
		 * Close - fecha o navegador
		 */
	}

}
