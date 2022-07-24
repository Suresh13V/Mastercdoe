package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DataUtil;


public class dataprovider_Part1 extends DataUtil{

	@Test(dataProvider = "Login" )
	public void main(String email , String pass) {
		
		
		  System.out.println(email+ "  "+ pass);
		  
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\\\Work From Home files\\\\Work From Home files\\\\Selenium files\\\\chromedriver_win32 (1)//chromedriver.exe"
		  );
		 
	WebDriver d = new ChromeDriver();
	d.get("https://arcbill-qa.archarina.com/");
	d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$login_userName']")).sendKeys(email);
	d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$login_passWord']")).sendKeys(pass);
	d.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
	System.out.println(d.getTitle());
	d.close();
	}
	}
	

