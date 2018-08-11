package week1.day2;



public class StudentDataUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] studentNames = {"Ram","Raja", "Rani", "Ravi", "Kamal"};
		int [] studentsAge = {15,15,15,15,15};
		char [][] grades= {{'A','B','C','D','E'}, {'B','B','B','B','B'}, {'B','A','F','D','E'},{'B','A','F','D','E'}, {'A','B','C','D','E'}};
		
		for(int index=0; index<=4; index++)
		{
			System.out.println(studentNames[index] +" who is " +studentsAge[index] +" years old scored " +grades[index][0] +"," +grades[index][1] +"," +grades[index][2] +","
					+grades[index][3] +","+grades[index][4]);
		}

	}

}
