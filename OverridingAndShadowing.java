package com.project.java;

/*
 * In Java you can only override instance methods and not instance variables.
 * can utilize getter methods for such purpose
 * 
 * Only static methods can be shadow but not the normal method
 * Reference: https://www.geeksforgeeks.org/g-fact-63/
 * */

public class OverridingAndShadowing {

	public static void main(String[] args) {
		/*
		 * Within a class, a field that has the same name as a field in the 
		 * -superclass hides the superclass's field, even if their types are different
		 * */
		//This is shadowing not inheritance
		A a = new B();
		System.out.println(a.getValue());
		System.out.println(a.getvalueStatic());
        System.out.println(a.i);
        
        B b = new B();
		System.out.println(b.getValue());
		System.out.println(b.getvalueStatic());
        System.out.println(b.i);
	}
}

class A {
    int i = 10;
    
    public String getValue(){
    	return "A";
    }
    
    public static String getvalueStatic(){
    	return "A";
    }
}

class B extends A {
	
	/* This is Shadowing not overriding as it does not apply on Instance variables
	 * */
    int i = 20;
    
    /* This is Overriding
     * */
    public String getValue(){
    	return "B";
    }
    
    public static String getvalueStatic(){
    	return "B";
    }
}