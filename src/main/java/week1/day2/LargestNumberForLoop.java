package week1.day2;

public class LargestNumberForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= {22,32,42,-22,-9};
		int maxNumber=numbers[0];
		for(int i=1; i<=4; i++) 
		{
			
		if(numbers[i]>maxNumber)
		{
		maxNumber=numbers[i];
		
		}
		}
			System.out.println("The largest number is: " +maxNumber);
			
		}
	}


