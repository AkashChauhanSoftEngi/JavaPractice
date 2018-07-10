package com.project.java;

/*
 * Throw vs Throws in java. 1. Throws clause is used to declare an exception, which means it works similar to the try-catch block. 
 * On the other hand throw keyword is used to throw an exception explicitly.
 * 
 * */

public class ThrowsAndThow {

	public static void main(String[] args) {
		ThrowsAndThow obj = new ThrowsAndThow();
		try{
		obj.checkAge(13);
		}
		catch(Exception e){
			System.out.println("ArithmeticException");
		}

		try {
			System.out.println(obj.division(15, 0));
		} catch (ArithmeticException e) {
			System.out.println("You shouldn't divide number by zero");
		}

	}

	void checkAge(int age) {
		if (age < 18)
			throw new ArithmeticException("Not Eligible for voting");
		else
			System.out.println("Eligible for voting");
	}

	int division(int a, int b) throws ArithmeticException {
		int t = a / b;
		return t;
	}

}
