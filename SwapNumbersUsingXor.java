package com.project.java;

/*
 * If you XOR a number with itself it becomes 0
 * 1- (1->0, 0->1)
 * 2- (i ^ i: 0)
 * */

public class SwapNumbersUsingXor {

	public static void main(String[] args) {
		int i=2,j=3;

		int temp = i;
		i = (i ^ j) ^i;
		j = (temp ^ j) ^j;
		
		System.out.println(i + "," + j);
		
		i=2;
		j=3;
		
		/*Without any temporary variable*/
		j = i ^ j; // i = 2, j = ...
		i = i ^ j; // i = 3, j = ...
		j = j ^ i; // i = 3, j = 2
		
		System.out.println(i + "," + j);
	}

}
