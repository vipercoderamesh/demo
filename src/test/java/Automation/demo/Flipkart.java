package Automation.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	
	
WebDriver driver;
	
	
	
	@Test
	public void Browsersetup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	}
	

}
