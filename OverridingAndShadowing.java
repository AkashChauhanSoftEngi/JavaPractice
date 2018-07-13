package com.project.java;

/*
 * In Java you can only override instance methods and not instance variables.
 * Method overriding is only applicable to instance methods.
 * Extending a class only make instance methods available to the sub class for overriding(and not class methods i.e. static).
 * Variables are not the candidates for overriding.
 * */

public class OverridingAndShadowing {

	public static void main(String[] args) {
		
		A a = new B();
		System.out.println(a.getValue());
        System.out.println(a.i);
        
        B b = new B();
		System.out.println(b.getValue());
        System.out.println(b.i);
	}
}

class A {
    int i = 10;
    
    public String getValue(){
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
    
}