package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@org.testng.annotations.Test
public class Test {
	
	public void invokeBrowser() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
driver.get("https://smallpdf.com/word-to-pdf");
	
driver.manage().window().maximize();

Thread.sleep(20);

	driver.findElement(By.xpath("//span[@class='sc-8s01yt-5 gGeCVP']")).sendKeys("C:\\Users\\krao0\\Downloads\\QA_Resume.docx");
	
	
	
	
	}
	

}
