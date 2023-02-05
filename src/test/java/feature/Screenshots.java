package feature;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Screenshots {

	private WebDriver driver;

	@Test
	public void invoke() throws InterruptedException {

	WebDriver	driver = new ChromeDriver();
	

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@AfterTest
	public void textBox(ITestResult result) throws IOException {

		driver.findElement(By.name("enter-name")).sendKeys("test");

		driver.close();

		if (result.getStatus() == ITestResult.FAILURE) {

			File destFile = new File("scr" + File.separator + result.getTestClass().getRealClass().getSimpleName() + "_"
					+ result.getMethod().getMethodName() + ".png");

SS(destFile);
			
		}

	}

	private void SS(File destFile ) throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(srcFile, destFile);

	}

}
