package inheritance;

public class Hiererchiy_inherit {
	
public static void main(String[] args) {
		
		B obj1 = new B();
		
		System.out.println(obj1.b);
		obj1.Display();
		System.out.println(obj1.a);
		obj1.Show();
		
		D obj2 = new D();
		
		System.out.println(obj2.d);
		obj2.Note();
		System.out.println(obj2.a);
		obj2.Show();
		
		
}

}
