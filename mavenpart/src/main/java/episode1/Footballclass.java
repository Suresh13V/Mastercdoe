package episode1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Footballclass {
	
	@Test
	public void main() {

	System.setProperty("webdriver.chrome.driver", "D:\\\\Work From Home files\\\\Work From Home files\\\\Selenium files\\\\chromedriver_win32 (1)//chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.goal.com/en/live-scores");
	System.out.println("FOotball title "+ d.getTitle());
		
	}

}
