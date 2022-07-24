package testNGBasic;

import org.testng.annotations.Test;

public class Arrtibute4 {
	
	@Test(enabled = false)
	public void Signup() {

		System.out.println("SIgn Up");
	}
	
	@Test(description = " Done for the day ")
	public void Login() {

		System.out.println("Login");
	}
	
	@Test(description = " Confortable")
	public void Homepage() {

		System.out.println("Home page");
	}

}
