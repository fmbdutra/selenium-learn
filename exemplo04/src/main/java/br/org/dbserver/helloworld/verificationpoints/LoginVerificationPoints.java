package br.org.dbserver.helloworld.verificationpoints;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoints {
	private WebDriver driver;
	
	public LoginVerificationPoints(WebDriver driver){
		this.driver = driver;
	}
	
	public void checkHelloUserMessage() {
				
		if(this.driver.getPageSource().contains("")) {
		
			System.out.println("Entrou");
			
		}	
		
		else {
			System.out.println("Não encontrou");
		}
		
		//assertTrue(this.driver.getPageSource().contains("Hi demo"));
	}	
}
