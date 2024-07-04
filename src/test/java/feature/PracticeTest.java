package feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Login;

public class PracticeTest {

	static WebDriver driver;

	@Test
	public void invokeBrowser(String Raghu , String Mech) {

	

		driver = new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			
		Login.userEmail.sendKeys(Raghu);
//		Login..sendKeys(Mech);
		Login.submit.click();
		
		
		
	}

}
