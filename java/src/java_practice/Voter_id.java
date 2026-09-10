package java_practice;

import java.util.Scanner;

public class Voter_id {
	public static void main(String [] args) {
		
		Scanner age = new Scanner(System.in);
		System.out.println("Enter your age :");
		int Age = age.nextInt();
		
		if(Age<=13) {
			System.out.println("Child");
		}
		else if(Age<18){
			System.out.println("Teenager");
		}
		else {
			System.out.println("Adult");	
		}
		
		
	}

}
