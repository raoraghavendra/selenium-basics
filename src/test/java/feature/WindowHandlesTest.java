package feature;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlesTest {

	@Test
	public void winHandle() {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.google.com/");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.amazon.com/");

		Set<String> wh = driver.getWindowHandles();
	

		System.out.println(wh);

		for (String whs : wh) {

			driver.switchTo().window(whs).getTitle();

			System.out.println(driver.switchTo().window(whs).getTitle());

			driver.quit();

		}

	}

}
