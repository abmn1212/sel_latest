package week1.day1.homework;

public class ArithmeticOperation {
	int numberOne=20, numberTwo=10, D, C, E, F, div=5;
	public  void addTwoNumbers() {

		C=numberOne+numberTwo;
		System.out.println("Addition of 2 numbers is:" +C);

	}
	public int substract() {
		D=numberOne-numberTwo;
		System.out.println("Addition of 2 numbers is:" +D);
		return D;
	}
	public int multiply() {
		E=numberOne*numberTwo;
		System.out.println("mulitiplication of 2 numbers is:" +E);
		return E;
	}
	public int divideNumberTwo() {
		System.out.println("division of 2 number is:" +(numberOne/div));
		return 0;
	}


}

