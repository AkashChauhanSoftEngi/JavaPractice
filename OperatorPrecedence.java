package com.project.java;

/*
 *  Help
 *  http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
 * */

public class OperatorPrecedence {

	public static void main(String[] args) {
		
		int i=10;
		System.out.println(i++ + ++i + i--);
		
		int a = (4 + (2 * 3));
		/*'*' has higher precedence than '+' in java*/
		System.out.println(a);
		
	}

}
