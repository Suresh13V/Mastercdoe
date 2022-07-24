package testNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Crick {
	
	@Test
	public void main() {

	System.setProperty("webdriver.chrome.driver", "D:\\\\Work From Home files\\\\Work From Home files\\\\Selenium files\\\\chromedriver_win32 (1)//chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("http://openapps.archarena.com/lm200/Login.aspx#");
	
	d.navigate().to("https://www.cricbuzz.com/");
	
	//d.findElement(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$txtUserName']")).sendKeys("vsuresh@innospire.com", Keys.TAB , "1234", Keys.TAB, Keys.TAB.ENTER);
	
	String s = d.getTitle();
	
	System.out.println(s);
	
	}
}
