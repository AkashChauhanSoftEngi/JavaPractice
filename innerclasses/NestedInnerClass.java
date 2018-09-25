package com.project.java.innerclasses;

/*
 * Application: All 
 * Nested Inner class can access any private instance variable of outer class
 * we can’t have static method in a nested inner class
 * Reference: https://www.geeksforgeeks.org/inner-class-java/
 * */
public class NestedInnerClass {
	private int a = 12;

	class InnerClass {
		public void show() {
			System.out.println("a: " + a);
			System.out.println("In a nested class method");
		}
	}

	public static void main(String[] args) {
		NestedInnerClass.InnerClass obj = new NestedInnerClass().new InnerClass();
		obj.show();
	}
}
