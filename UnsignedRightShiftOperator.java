package com.project.java;

/*
 * Unsigned right shift Operator >>> (does not respect sign of Number, does not preserve the 1st bit)
 * Why no unsigned left Operator[<<<]?
 * - As <<, serves the same purpose.
 * It does not preserve the sign bit [Left most]
 * 
 * how to create unsigned integer?
 * - Some methods or operator treat them unsigned like >>>
 * - Integer.parseUnsignedInt("xyz");, is another way in java-8
 * 
 * */
public class UnsignedRightShiftOperator {

	public static void main(String[] args) {
		int vInt = Integer.parseUnsignedInt("4294967295");
		
		System.out.println(vInt>>3);
		System.out.println(vInt>>>3);
	}
}
