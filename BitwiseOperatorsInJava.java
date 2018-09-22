package com.project.java;

/*
 * Reference: https://www.programiz.com/java-programming/bitwise-operators#or
 * */
public class BitwiseOperatorsInJava {

	public static void main(String[] args) {
		
		/*Bitwise OR
		 *   00001100
		   | 00011001
  			 ________
  			 00011101  
		 * */
		int number1 = 12, number2 = 25, result;
    	result = number1 | number2;
    	System.out.println(result);
    	
    	/*Bitwise AND
    	 *  00001100
		  & 00011001
            ________
  			00001000 
    	 * */
    	result = number1 & number2;
    	System.out.println(result);
    	
    	/*Bitwise complement 
    	 * 0->1, 1->0
    	 * */
    	result = ~number1;
    	System.out.println(result);
    	
    	/*Bitwise XOR
    	 * 0,1->1, 1,0->0{if opposite then true}
    	 *   00001100
		 ^   00011001
             ________
         	 00010101
    	 * */
    	result = number1 ^ number2;
    	System.out.println(result);
    	
    	number1 = 2;
    	int i = number1 & number1;
    	if(i%2==0){
    		System.out.println("Even Number!");
    	}
    	
    	number1 = 3;
    	i = number1 & number1;
    	if(i%2!=0){
    		System.out.println("Odd Number!");
    	}
    	
	}
}


