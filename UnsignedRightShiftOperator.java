package com.project.java;

/*
 * Unsigned right shift Operator >>> (does not respect sign of Number, does not preserve the 1st bit)
 * Why no unsigned left Operator[<<<]?
 * - As <<, serves the same purpose.
 * - It does not preserve the sign bit [Left most]
 * - Holding of the property of signed or unsigned, is the related to signed or unsigned interger
 * - Operator are not responsible for this at all
 
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
/*
 * To preserve the sign of the number, during an arithmetic right shift, instead of filling the left-most vacant positions with 0s, the sign bit (leftmost bit) of the number is used to fill these positions. This is a kind of sign extension.
   For example,
   0010 1100 0101 1011 arithmetic right shift by 2 postions gives 0000 1011 0001 0110.
   1010 1100 0101 1011 arithmetic right shift by two positions gives 1110 1011 0001 0110. The result of the shifting is thus still a negative number (sign bit 1).
 * 
 * Reference: https://www.quora.com/Why-is-there-no-unsigned-left-shift-operator-in-Java
 * */
