package com.project.java;

/*
 * Left Shift	: N*(2^b)
 * Right Shift	: N/(2^b)
 * It preserves the sign bit [Left most]
 * Reference: https://www.youtube.com/watch?v=cymclYDL_Ec
 * */

public class LeftAndRightShiftOperator {

	public static void main(String[] args) {
		int i = 127;
		i=(i << 2);
		System.out.println(i); 
	}
}
