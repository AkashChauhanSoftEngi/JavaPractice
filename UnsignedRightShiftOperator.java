package com.project.java;

/*
 * Unsigned right shift Operator >>> (does not respect sign of Number, does not preserve the 1st bit)
 * Why no unsigned left Operator[<<<]?
 * - As <<, serves the same purpose.
 * It does not preserve the sign bit [Left most]
 * */
public class UnsignedRightShiftOperator {

	public static void main(String[] args) {
		int i = -25;
		System.out.println(i>>3);
		System.out.println(i>>>3);
	}
}
