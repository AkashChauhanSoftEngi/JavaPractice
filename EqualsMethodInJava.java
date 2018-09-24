package com.project.java;

/* StringOne.equals(StringTwo): checks if values are same or not, even if the values are from different objects
 * ==: checks if the same object or not [same reference to the memory]
 * */
public class EqualsMethodInJava {

	public static void main(String[] args) {
		String k = "K";
		String l = "K"; //It will return the same reference if string value exist in the string pool
		String m = new String("K"); //It will create new object, in heap
		
		if(k==l){
			System.out.println("Equal");
		}
		
		if(k==m){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		if(k.equals(l)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		if(k.equals(m)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}

}
