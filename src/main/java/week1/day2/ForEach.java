package week1.day2;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] studentNames = {"Ram","Raja", "Rani", "Ravi", "Kamal"};
		int [] studentsAge = {15,15,15,15,15};
		char [][] grades= {{'A','B','C','D','E'}, {'B','B','B','B','B'}, {'B','A','F','D','E'},{'B','A','F','D','E'}, {'A','B','C','D','E'}};
		
		for( String name: studentNames) 
		{
		System.out.println(name);	
		}
		for( int age: studentsAge) 
		{
		System.out.println(age);	
		}
		for( String length: studentNames) 
		{
		System.out.println(length.length());	
		}

	}

}
