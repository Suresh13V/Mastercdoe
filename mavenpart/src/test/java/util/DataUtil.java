package util;

import org.testng.annotations.DataProvider;

public class DataUtil {
	
	@DataProvider(name = "Login" , indices = {0})
	public String[][] getdata() {
	
		String[][] data = new String[2][2];
		
		
		
		data[0][0] = "sajith@innospire.com";
		data[0][1] = "Password@123";	
		
	    data[1][0] = "gdeepa@Innospire.com";
	    data[1][1] = "Password@123";
	    
	    return data;
	    
	}
	

}
