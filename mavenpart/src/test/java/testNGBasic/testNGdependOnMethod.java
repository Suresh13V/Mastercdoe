package testNGBasic;



import org.testng.annotations.Test;

public class testNGdependOnMethod {

	@Test(enabled = false)
	public void Signup() {

		System.out.println("SIgn Up");
	}
	
	@Test(dependsOnMethods  = "Signup",priority = -1)
	public void Login() {

		System.out.println("Login");
	}
	
	@Test(dependsOnMethods  = "Login")
	public void Homepage() {

		System.out.println("Home page");
	}
	
	@Test(dependsOnMethods  = "Homepage")
	public void Navigate_Bill() {

		System.out.println("Navigated_Bill");
	}
	
	@Test(dependsOnMethods  = "Navigate_Bill")
	public void Bill_Screen() {

		System.out.println("Bill_Screen");

	}
}

