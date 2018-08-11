package week1.day2;

public class LargestNumberForEachLoop {

	public static void main(String[] args) {
		int [] numbers= {22,32,42,-22,-9};
		int maxNumber=numbers[0];
		for(int i:numbers) 
		{
			if(i>maxNumber)
			{
				maxNumber=i;
			}
		}
		System.out.println("The largest number is: " +maxNumber);
	}
}


