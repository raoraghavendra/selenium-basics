package feature;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CollectionTest {

	@Test
	public void Hashmap() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> ptitle = driver.findElements(By.xpath("//*[@class='product-title']")); // string
		List<WebElement> pprice = driver.findElements(By.xpath("//*[@class='price actual-price']")); // double

		Map<String, Double> exe = new HashMap<String, Double>();

		for (int i = 0; i < ptitle.size(); i++)

		{

			String a = ptitle.get(i).getText();
			Double b = Double.parseDouble(pprice.get(i).getText());

			exe.put(a, b);
		}

		for (Map.Entry<String, Double> coll : exe.entrySet()) {

			System.out.println(coll.getKey() + " " + coll.getValue());

		}

	}

}
