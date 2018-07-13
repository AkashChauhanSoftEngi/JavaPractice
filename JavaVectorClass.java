package com.project.java;

import java.util.*;

/*
 * The Vector class implements a grow-able array of objects.
 * Vector implements a dynamic array that means it can grow or shrink as required.
 * 
 * Reference: https://www.geeksforgeeks.org/java-util-vector-class-java/
 * */

public class JavaVectorClass {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
        v.add(2);
        v.add("geeks");
        v.add("forGeeks");
        v.add(3);
        
        v.add(5, 1);
        v.add(6, 2);
        v.add(7, "geeks");
        v.add(8, "forGeeks");
        v.add(9, 3);
        
        System.out.println("Vector is " + v);
        
        ArrayList arr = new ArrayList();
        arr.add(3);
        arr.add("geeks");
        arr.add("forgeeks");
        arr.add(4);
         
     // copying all element of array list int0 vector
        v.addAll(arr);
         
        // checking vector v
        System.out.println("vector v:" + v);
	}

}
