package com.project.java.innerclasses;

/*
 * Static nested classes are not technically an inner class. They are like a static member of outer class.
 * To access anything outside Static inner class, must be static member outside the class
 * If you have the static member inside static nested class, you don't need to create instance of static nested class.
 * */
public class StaticNestedClass {
	
	private static int x=9;
	
	public static void main(String[] args) {
		Inner obj = new Inner();
		obj.sub();
		
		//Or
		StaticNestedClass.Inner.add();
	}
	
	// A static inner class
	static class Inner {
		public void sub() {
			System.out.println(x);
			System.out.println("inside static inner class Method");
			outerMethod();
			add();
		}
		public static void add(){
			System.out.println("Inside add method");
		}
	}
	
	private static void outerMethod() {
		System.out.println("inside outerMethod");
	}
}
