package com.project.java;

import java.math.BigDecimal;
import java.math.BigInteger;
/*
 * Float, int, double should not be used for precise values like currency
 * BigDecimal and BigInteger are suitable data type for such cases
 * 
 * BigDecimal : 32 bytes
 * BigInteger : 56 bytes (int: 4 byte)
 * */
public class JavaBigDecimalAndBigInteger {

	public static void main(String[] args) {
		
		int a=333333333; //32 bits (2^32)-1
		long b=666666666666666666l; //64 bits (2^64)-1
		
		System.out.println(a + b);
		
		/* Can store really large values
		 * have to use string as such a large number can not be stored as number
		 * */
		
		BigInteger bigInt = new BigInteger("333333333333333333333333333333333");
		bigInt.add(new BigInteger("2"));
		bigInt.subtract(new BigInteger("2"));
		bigInt.multiply(new BigInteger("2"));
		bigInt.divide(new BigInteger("3"));
		bigInt.remainder(new BigInteger("3"));
		System.out.println(bigInt);
		
		/*-------------------------------------------------*/
		float k = 1.2f;
		float l = 1.0f;
		System.out.println("k-l: " + (k-l));
		
		double m = 1.2;
		double n = 1.0;
		System.out.println("m-n: " + (m-n));
		
		/* Give more precise value than float and double
		 * It is always good to, use double value as string to get more precise result
		 * */
		BigDecimal p = new BigDecimal("1.2");
		BigDecimal q = new BigDecimal("1.0");
		System.out.println("p-q: " + (p.subtract(q)));
		
		BigDecimal bigDec = new BigDecimal(3.2333333333333333333333333333333333333);
		bigDec.multiply(new BigDecimal(1.2));
		System.out.println(bigDec);
	}

}
