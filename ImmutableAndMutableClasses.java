package com.project.java;

/*
 * When we create a String using double quotes, it first looks for the String with same value in the JVM string pool, if found it returns the reference else it creates the String object and then place it in the String pool. This way JVM saves a lot of space by using same String in different threads. 
 * But if new operator is used, it explicitly creates a new String in the heap memory. 
 * */

public class ImmutableAndMutableClasses {
	
	/*String is immutable whereas StringBuffer and StringBuider are mutable classes.*/
	/*Easy to share it across different threads or functions*/
	/*String is a final class, that class can't be extended*/
	public static void main(String[] args) {
		String first = "One";
		/*String is Immutable so another copy is created when altering*/
		one(first);
		System.out.println(first);
		
		/*StringBuffer & StringBuilder are Mutable classes*/
		StringBuffer second = new StringBuffer("two");
		two(second);
		System.out.println(second);
		
		StringBuilder third = new StringBuilder("three");
		three(third);
		System.out.println(third);
	}
	
	public static void one(String first){
		first = first + "Additional";
	}
	
	public static void two(StringBuffer second){
		second.append("Additional");
	}
	
	public static void three(StringBuilder third){
		third.append("Additional");
	}
}
