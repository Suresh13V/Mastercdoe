package episode27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work From Home files\\Work From Home files\\Selenium files\\chromedriver_win32 (1)//chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://arcbill-qa.archarina.com/");
		
		d.findElement(By.name("ctl00$ContentPlaceHolder1$login_userName")).sendKeys("vsuresh@innospire.com");

		d.findElement(By.name("ctl00$ContentPlaceHolder1$login_passWord")).sendKeys("Password@123");

		d.findElement(By.id("ContentPlaceHolder1_btnLogin")).click();
		
		d.findElement(By.xpath("//*[@id=\"menu-List\"]/li[5]/a")).click();
		
		d.findElement(By.xpath("//*[@id=\"bills-Invoice-Menu\"]/a")).click();
		
		System.out.println(d.getTitle());
		
		d.findElement(By.id("filter-toggle-btn")).click();
		
		d.findElement(By.xpath("//*[@id=\"isc-filter-container\"]/div/div[1]/div[2]/span/span[1]/span"));
		
		d.findElement(By.xpath("//*[@id=\"select2-slt-Invoice-result-kcdr-123\"]")).click();	
		
		
		//select SS = new select(elm);
		
		//boolean blm = SS.isMultiple();
		
		//SS.selectByIndex(0);
			
		
		
		
		//d.close();
		
			

		//d.findElement(By.xpath("//*[@id=\"groupEntityType\"]/li[2]/a")).click();

		//d.findElement(By.xpath("//*[@id=\"tblEntity\"]/tbody/tr/td[3]/a")).click();
		
		//d.findElement(By.id("filter-toggle-btn")).click();
		
		//WebElement elm = d.findElement(By.xpath("//*[@id=\"flterContainer\"]/div[1]/div/div/div[1]/div"));
		
		//Select slc = new Select(elm);
		
		//boolean bl = slc.isMultiple();
		
		
		
		
		

	}

}
