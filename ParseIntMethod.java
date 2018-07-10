package com.project.java;

/*
 * The method generally used to convert String to Integer in Java is parseInt().
 * One of the methods in Integer class
 * */

public class ParseIntMethod {

	public static void main(String[] args) {
		int value = 0;
		value = Integer.parseInt("123");
		System.out.println(value);
		
		try {
			value = Integer.parseInt("123h");
			System.out.println(value);
		} catch (Exception e) {
			System.out.println("NumberFormatException");
		}
	}
}
