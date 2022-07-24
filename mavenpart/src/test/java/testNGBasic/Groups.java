package testNGBasic;

import org.testng.annotations.Test;

public class Groups {
	

	@Test(groups = "Smoke")
	public void Signup() {

		System.out.println("Sign Up");
	}
	
	@Test(groups = "Sanity")
	public void Login() {

		System.out.println("Login");
	}
	
	@Test(groups = "Reg")
	public void Homepage() {

		System.out.println("Home page");

}
	}
