package testNGBasic;

import org.testng.annotations.Test;

public class Arrtibute_Priority {

	@Test(priority = 1)
	public void Signup() {

		System.out.println("SIgn Up");
	}
	
	@Test
	public void Login() {

		System.out.println("Login");
	}
	
	@Test(priority = 2)
	public void Homepage() {

		System.out.println("Home page");
	}
	
	@Test(priority = 3)
	public void Navigate_Bill() {

		System.out.println("Navigated_Bill");
	}
	
	@Test(priority = -1)
	public void Bill_Screen() {

		System.out.println("Bill_Screen");
	}
}
