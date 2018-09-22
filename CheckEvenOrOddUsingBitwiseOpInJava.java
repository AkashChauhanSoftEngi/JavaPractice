package com.project.java;

/*
 * We prefer bitwise operator for checking even odd because the traditional way of checking even by n % 2 ==0
 * is compassionately expensive compared to bitwise & operator (Big O(1) time complexity)
 * 0bNumber, 0BNumber: Binary Number
 * Number: Decimal
 * 0Number: Octal
 * 0xNumber (or 0X): Hexadecimal [0-15, 0-F]
 * 
 * Number Conversion: {return String}
 * Integer.toBinaryString(intNum);
 * Integer.toOctalString(intNum);
 * Integer.toHexString(intNum)
 *
 * */
public class CheckEvenOrOddUsingBitwiseOpInJava {

	public static void main(String[] args) {
		int number = 5;
		if((number & 0X1) == 1){
			System.out.println("It is a odd number!");
		}
		
		/*Binary Conversion*/
		String strBin = Integer.toBinaryString(number);
		System.out.println(strBin);
	}

}
