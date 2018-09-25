package com.project.java.innerclasses;
/*
 * Inner class can be declared within a method of an outer class.
 * Method Local inner classes can’t use local variable of outer method until that local variable is not declared as final.
 * But from JDK 1.8 it is possible to access local variable by local inner class
 * Method local inner class can’t be marked as private, protected, static and transient but can be marked as abstract and final
 * , but not both at the same time. (final or abstract but not both at a time)
 * */
public class MethodLocalInnerClass {
	
	void outerMethod() { 
		final int x = 1;
        System.out.println("inside outerMethod"); 
        // Inner class is local to outerMethod() 
        final class Inner { 
            void innerMethod() {
            	System.out.println("x: " + x);
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod(); 
    }
	
	public static void main(String[] args) {
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.outerMethod();
	}
}
