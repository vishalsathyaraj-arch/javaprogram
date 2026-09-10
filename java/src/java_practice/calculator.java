package java_practice;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter first number :");
	int a= scan.nextInt();
	
	System.out.println("Enter second number :");
	int b= scan.nextInt();
	
	System.out.println("Choose the operator :");
	char operator = scan.next().charAt(0);
	
	if (operator=='+') {
		System.out.println("Result :"+(a+b));
	}
	
	else if(operator=='-') {
		System.out.println("Result :"+(a-b));
	}
	else if(operator=='*') {
		System.out.println("Result :"+(a*b));
	}
	else if(operator=='/') {
		System.out.println("Result :"+(a/b));
	}
	else if(operator=='%') {
		System.out.println("Result :"+(a%b));
	}
	else {
		System.out.println("Invalid operator");
	}
	
	
	
	
	
	
	
	
	 
	
	}
}

