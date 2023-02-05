package feature;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class DynamicDropdown {

	public WebDriver driver;

	@Test()
	public void dp() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("hyd");

		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@role='listbox']//li"));

		for (WebElement lele : ele) {

			String li = lele.getText();
			System.out.println(li);

			driver.quit();

		}

	}

	private void screenShot() throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
	File srcFile = 	screenshot.getScreenshotAs(OutputType.FILE);
	
FileHandler.copy(srcFile, srcFile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
