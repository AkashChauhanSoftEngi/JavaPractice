package com.project.java;

/*
 * 
 * Encapsulation, hiding the field within the class
 * Also referred as a data hiding
 * 
 * */
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		System.out.println(obj.b);

		/* But you can not access variable 'a' here in this class */
		// System.out.println(obj.a); /*Compiler Error*/
	}

}

class Sample {
	private int a = 1;
	int b = 2;
}
