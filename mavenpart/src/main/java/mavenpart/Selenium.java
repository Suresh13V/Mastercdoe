package mavenpart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;

public class Selenium {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver","D:\\Work From Home files\\Work From Home files\\Selenium files\\chromedriver_win32 (1)//chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();

		d.get("https://arcbill-qa.archarina.com/");
		
		d.findElement(By.id("ContentPlaceHolder1_login_userName")).sendKeys("vsuresh@innospire.com");
		
		d.findElement(By.id("ContentPlaceHolder1_login_passWord")).sendKeys("Password@123");
		
		d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnLogin\"]")).click();
		
		Navigation N = d.navigate();
		
		N.to("https://arcbill-qa.archarina.com/APAgingDetailReport.aspx#");
		
		d.findElement(By.id("filter-toggle-btn")).click();
		
		WebElement wl = d.findElement(By.xpath("//div[@class='fs-label-wrap']"));
		
		
		 //*[text()='Choose Vendor Name']
		//div[@class='fs-label']
		
		Select slc = new Select(wl);
		
		slc.selectByIndex(1);
		slc.selectByValue("13045");
		slc.selectByVisibleText("Issues vendor");
		
		
		
		
		
		
		
		
		//d.close();
		
		
		

		//File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//Files.copy(f,new File("D:\\Work From Home files\\Work From Home files\\Selenium files.png"));
		
		
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//d.findElement(By.name("ctl00$ContentPlaceHolder1$txtUserName")).sendKeys("vsuresh@innospire.com");
		
		//d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtPasswrod\"]")).sendKeys("1234");
		
		//d.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		
		//d.findElement(By.xpath("//*[@id=\"groupEntityType\"]/li[2]/a")).click();
		
		//d.findElement(By.xpath("//*[@id=\"tblEntity\"]/tbody/tr/td[3]/a")).click();
		
		
		




	}

	private static Object id(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
