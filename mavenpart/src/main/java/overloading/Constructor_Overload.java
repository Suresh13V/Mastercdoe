package overloading;

public class Constructor_Overload {
	
	Constructor_Overload ()
	{
		System.out.println(" Constructor_Overload without parameter ");
	}
 Constructor_Overload(int a )
   {
	 
	System.out.println("a = "+ a ); 

 }
 
 public static void main(String[] args) {
	
	 Constructor_Overload obj = new Constructor_Overload();
	  
	 Constructor_Overload obj2 = new Constructor_Overload(10);
	 
	 
	
}
}
