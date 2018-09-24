package com.project.java;

/*
 * Must tell JVM that, the decimal point value is not double value
 * You need to add f or F with DPV to store it as a float
 * Otherwise JVM will consider DPV as double by default if no f/F is added with the value
 * 
 * Precision: total digits
 * Scale: digits after decimal point
 * 
 * (JDK1.8)
 * Float: Scale-> 8, default: 0.0F
 * Double: Scale-> 17, default: 0.0F
 * */
public class JavaFloatAndDoubleDataTypes {
	static float d;
	static double e;

	public static void main(String[] args) {
		float a = 0.123456789f;
		double b = 0.123456789123456789;
		double c = 3D;
		System.out.println("Float: " + a + "\nDouble: " + b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);
		System.out.println("E: " + e);
		
		float k = 1.2f;
		float l = 1.0f;
		System.out.println("k-l: " + (k-l));
		
		double m = 1.2;
		double n = 1.0;
		System.out.println("m-n: " + (m-n));

	}
}
