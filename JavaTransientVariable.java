package com.project.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * The transient keyword in Java is used to indicate that a field should not be serialized.
 * */

public class JavaTransientVariable {

	public static void main(String[] args) {
		DemoTwo object = new DemoTwo(1, "geeksforgeeks", "Sample");
		String filename = "file.ser";

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		DemoTwo object1 = null;

		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (DemoTwo) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
			/*
			 * The transient keyword in Java is used to indicate that a field should not be serialized.
			 * */
			System.out.println("C would be assign to its defaul value");
			System.out.println("c = " + object1.c);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

}

class DemoTwo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	public int a;
	public String b;
	public transient String c;

	public DemoTwo(int a, String b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}}
