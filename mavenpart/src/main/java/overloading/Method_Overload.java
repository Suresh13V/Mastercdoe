package overloading;

public class Method_Overload {

	public void display()
	{
		System.out.println(" Constructor_Overload without parameter ");
	}
   void display(int a)
   {
	 
	System.out.println("a = "+ a ); 

 }

 public static void main(String[] args) {
	
	 Method_Overload obj = new Method_Overload();
	 
	 obj.display();
	 obj.display(10);
}

}