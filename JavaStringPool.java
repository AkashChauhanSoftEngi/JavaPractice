package com.project.java;

/*
 * JVM has a string pool where it keeps at most one object of any String.
 * String literals objects are always created in the string pool for re-usability purpose.
 * String objects created with the new operator do not refer to objects in the string pool.
 * The pooling concept has been made possible because the String objects are Immutable in Java
 * */
public class JavaStringPool {

	public static void main(String[] args) {
		String k = "K";
		String l = "K"; //It will return the same reference if string value exist in the string pool
		String m = new String("K"); //It will create new object, in heap, create different reference in StringPool		
		
		if(k==l){
			System.out.println("Equal");
		}
		
		if(k==m){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
	}

}
