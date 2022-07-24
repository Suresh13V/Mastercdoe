package abstractnew;

public class Class_A {

	double length;
	double breadth;

	Class_A(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

	void area()
	{
		System.out.println(length*breadth);
	}

	void perimeter()
	{
		System.out.println(2*(length+breadth));
	}
	
	
	
	
}

