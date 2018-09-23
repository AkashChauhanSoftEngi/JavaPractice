package com.project.java;

/*
 * Super.method(): single inheritance only, no way to access method of the super of the super class
 * Unless you, add super call in parent class as well
 * 
 * No multiple inheritance, otherwise Diamond Problem will be there
 * */

class A1 {
	public A1(){
		System.out.println("Inside A");
		add();
	}
	void add() {
		System.out.println("Add A");
	}
}

class B1 extends A1 {
	public B1(){
		System.out.println("Inside B");
	}
	void add() {
		super.add();
		System.out.println("Add B");
	}
	
	void sub(){
		System.out.println("Add D");
	}
}

public class DiamondProblemOfMultipleInheritance extends B1 {
	public DiamondProblemOfMultipleInheritance(){
		System.out.println("Inside C");
	}
	void add() {
		super.add();
		System.out.println("Add C");
	}

	public static void main(String[] args) {
		B1 foo = new DiamondProblemOfMultipleInheritance();
		foo.add();
		foo.sub();
	}
}
