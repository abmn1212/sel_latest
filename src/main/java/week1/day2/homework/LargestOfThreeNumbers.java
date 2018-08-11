package week1.day2.homework;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers: " );
		Scanner src = new Scanner(System.in);
		int num1 = src.nextInt();
		int num2 = src.nextInt();
		int num3 = src.nextInt();
		
		if(num1>num2 && num1>num3) 
		{
			System.out.println("The greatest number is: " +num1);
	
		}
		
		else if(num2>num3) 
		{
			System.out.println("The greatest number is: " +num2);
		}	
		
		else
		{
			System.out.println("The greatest number is: " +num3);
		}
			
	}

}

