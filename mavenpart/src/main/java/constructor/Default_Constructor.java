package constructor;

public class Default_Constructor {

	String name;
	int rno;
	Default_Constructor()
	{
		name = "SURESH";
		rno = 123;
	}

	public static void main(String[] args) {
		
		Parametrized_Constructor PC = new Parametrized_Constructor();
		
		System.out.println(PC.name);
		System.out.println(PC.rno);
	}
}
