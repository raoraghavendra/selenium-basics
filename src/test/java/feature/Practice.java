package feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Practice {
	
	static WebDriver driver ;
	
	@Test
	public void Invoke() {
	

		

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
