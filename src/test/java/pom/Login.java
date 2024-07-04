package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	
	
	@FindBy(xpath = "//input[@id='email']")
         	public static WebElement userEmail;
	
	

	
	
	
	

	@FindBy(xpath = "//button[@name='login']")
         	public static WebElement submit;
	
	
	
	
	@FindBy(xpath = "//button[@name='login']")
 	public static WebElement submitting;
	
	
	
	
	
	

}
