package com.project.java;

import java.util.GregorianCalendar;

/*
 * Java allows objects to implement a method called finalize() that might get called. 
 * finalize() method gets called if the garbage collector tries to collect the object. 
 * If the garbage collector doesn't run, the method doesn't get called. 
 * */
public class FinalizeMethod extends GregorianCalendar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			// create a new ObjectDemo object
			FinalizeMethod call = new FinalizeMethod();

			// print current time
			System.out.println("" + call.getTime());

			// finalize cal
			System.out.println("Finalizing...");
			call.finalize();
			System.out.println("Finalized.");

		} catch (Throwable ex) {
			ex.printStackTrace();
		}
	}

}
