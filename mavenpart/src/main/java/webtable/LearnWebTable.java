package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Work From Home files\\Work From Home files\\Selenium files\\chromedriver_win32 (1)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/table");
		
		WebElement table = driver.findElement(By.id("simpletable"));
		
		// y using table. Bcos, we need to get element from Table only, if need full page then we can use driver.
		
		List<WebElement> hearders = table.findElements(By.tagName("th"));
		
		for (WebElement header : hearders) {
			
			String text = header.getText();
			
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		//driver.quit();
		
	}

}
