package Operator;

import java.util.Scanner;

public class Evaluation {

	public static void main(String[] args) {
		
		//int age = 20;
		
		//String result = (age>=18)? " Eligible to vote " : " Not eligible to vote ";
		
		//System.out.println(result);
		
		//System.out.println((age>=18)? " Eligible to vote " : " Not eligible to vote ");
		
		//int salary = 27000;
		
		//if (age >= 18) {
			
		//if(salary >=27000) {
				
		//		System.out.println("eligible");
		//	}
	
		//}
		//else {
			
		//	System.out.println(" Not eligible ");
	//	}
		
	//}
	
	
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your age :");
	
	age = sc.nextInt();
	
	for ( int i=age;i<=10;i++) {
		
		System.out.println("My age is: "+i);
	}
	
	}
}
