package feature;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutosugessionsTest {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.facebook.com/");
		 * 
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * 
		 * System.out.println(links.size());
		 * 
		 * for (WebElement link : links) {
		 * 
		 * System.out.println(link.getText());
		 * 
		 * }
		 * 
		 * System.out.println(links);
		 */

		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("q")).sendKeys("sele");

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='erkvQe']//li[@class='sbct']"));
		
		
		
		
/*
		System.out.println(ele.size());
		for (int i = 0; i < ele.size(); i++) {
			System.out.println(ele.get(i).getText());
		}
*/
		
		
		
		
		for (WebElement elem : ele) {

			System.out.println(elem.getText());
			
			
		}



	}

}
