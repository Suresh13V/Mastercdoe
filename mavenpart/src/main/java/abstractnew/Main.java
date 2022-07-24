package abstractnew;

public class Main{
	

		public static void main(String[] args) {
			
			Class_A rec=new Class_A(8,10);
			square sq = new square(5);
			
			rec.area();
			rec.perimeter();
			System.out.println();
			sq.area();
			sq.perimeter();
		}	
	}


