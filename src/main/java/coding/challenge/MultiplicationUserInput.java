package coding.challenge;

import java.util.Scanner;

public class MultiplicationUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number1: ");
		Scanner scr = new Scanner(System.in);
		int num1 = scr.nextInt();
		System.out.println("Enter number2: ");
		int num2 = scr.nextInt();
		System.out.println("The multiplication table for" +num1 +":" );
		
		for (int i=1; i<=num1; i++) 
		{
			int num3 = i*num2;
			System.out.println(i +"*" +num2  +"=" +num3 );
			
		}
	}

}
