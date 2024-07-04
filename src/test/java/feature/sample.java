package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.extentreports.obj_properties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	
	
public 	WebDriver dr;

	 @Test
	public void login() throws InterruptedException
	{
		WebDriver dr= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
	dr.get("https://www.makemytrip.com/");
	
	dr.getTitle();
	dr.getCurrentUrl();
	System.out.println(dr.getTitle());
	System.out.println(dr.getCurrentUrl());
//	WebDriverWait wb = new WebDriverWait(dr, 3000);
	
	Thread.sleep(4000);
	dr.findElement(By.id("departure")).click();
	dr.findElement(By.className("DayPicker-Day DayPicker-Day--selected")).click();
	//dr.quit();
	
		
		
	}
	
	
	
	
	
	
	

}
