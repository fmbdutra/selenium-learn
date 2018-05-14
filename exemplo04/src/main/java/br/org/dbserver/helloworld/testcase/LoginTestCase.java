package br.org.dbserver.helloworld.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
