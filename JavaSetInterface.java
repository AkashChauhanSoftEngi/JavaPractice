package com.project.java;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
 * Basically, Set is implemented by HashSet, LinkedSet or TreeSet (sorted representation).
 * Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
 * Reference: https://www.geeksforgeeks.org/set-in-java/
 * */

public class JavaSetInterface {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Geeks");
		set.add("For");
		set.add("Geeks");
		set.add("Example");
		set.add("Set");

		/*No Duplicate Object, will be there*/
        System.out.print("Set output without the duplicates");
        System.out.println(set);
		
        /*To sort the set Interface elements*/
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);
        
	}

}
