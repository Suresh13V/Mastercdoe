package loginusingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjectmodel.LoginObject;


public class Signin {
	
	
	public static  WebElement ContentPlaceHolder1_login_userName;
	public static  WebElement ContentPlaceHolder1_login_passWord;
	public static  WebElement ContentPlaceHolder1_btnLogin;
	
	
	
	@Test
	public  void main() {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Work From Home files\\Work From Home files\\Selenium files\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://arcbill-qa.archarina.com/");
		
		 
		
		
		
	  //without using @FindBy and Find Element we are loacting values using element name 
		
		ContentPlaceHolder1_login_userName.sendKeys("vsuresh@innospire.com");
		ContentPlaceHolder1_login_passWord.sendKeys("Password@123");
		ContentPlaceHolder1_btnLogin.click();
		
		
		
		
		
		
		// using static function we calling by class name.
		
		
		/*
		 * LoginObject.Username(driver).sendKeys("vsuresh@innospire.com");
		 * LoginObject.Password(driver).sendKeys("Password@123");
		 * LoginObject.Submit(driver).click();
		 */
	
		
		// Using object to call from other package
		
		/*
		 * LoginObject login = new LoginObject();
		 * login.Username(driver).sendKeys("vsuresh@innospire.com");
		 * login.Password(driver).sendKeys("Password@123");
		 * login.Submit(driver).click();
		 */
		
		
		/* Normal flow */
		
		
		/*
		 * driver.findElement(By.id("ContentPlaceHolder1_login_userName")).sendKeys(
		 * "vsuresh@innospire.com");
		 * 
		 * driver.findElement(By.id("ContentPlaceHolder1_login_passWord")).sendKeys(
		 * "Password@123");
		 * 
		 * driver.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
		 * 
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.close();
		 */
	}

}
