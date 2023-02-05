package feature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownsStatic {

	@Test
	public void dropDown() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
   //   driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]")).click();
		WebElement ele =    driver.findElement(By.id("dropdown-class-example"));
	
		Select sc = new Select(ele);
		sc.selectByVisibleText("Option1");
		 Thread.sleep(2000);
		sc.selectByIndex(1);
		
		
		
		
	}

}
