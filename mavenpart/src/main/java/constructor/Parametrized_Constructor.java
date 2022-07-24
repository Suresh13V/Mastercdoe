package constructor;

public class Parametrized_Constructor {
	
	String name;
	int rno;
	Parametrized_Constructor()
	{
		name = "SURESH";
		rno = 123;
	}
	Parametrized_Constructor(String x , int y )
	{
		name = x;
		rno = y;
	}

	public static void main(String[] args) {
		
		Parametrized_Constructor PC = new Parametrized_Constructor();
		Parametrized_Constructor PCO = new Parametrized_Constructor("suresh" , 10);
		
		System.out.println(PC.name);
		System.out.println(PC.rno);
		System.out.println(PCO.name);
		System.out.println(PCO.rno);
	}
}
