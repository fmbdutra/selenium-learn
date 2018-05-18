package br.org.dbserver.helloworld.verificationpoints;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoints {
	private WebDriver driver;
	
	public LoginVerificationPoints(WebDriver driver){
		this.driver = driver;
	}
	
	public void checkHelloUserMessage() {
		
		String expectedMessage = "Hi demo";
				
		if(this.driver.getPageSource().contains(expectedMessage)) {
		
			System.out.println("Entrou na página");			
		}	
		
		else {
			System.out.println("Não encontrou");
		}
		
	}	
}
