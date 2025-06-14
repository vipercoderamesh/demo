package Automation.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class LoginPage {
	
	WebDriver driver;
	
	
	
	@Test
	public void Browsersetup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	

	

}
