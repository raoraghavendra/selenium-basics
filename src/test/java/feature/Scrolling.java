package feature;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	WebDriver driver;

	@Test
	public void scrollingDom() throws InterruptedException {

		// WebDriverManager.chromedriver().create();

		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,600)");

		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=100");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
