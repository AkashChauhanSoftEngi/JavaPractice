package com.project.java;
/*
 * Java Comparable interface is used to order the objects of user-defined class.
 * This interface is found in java.lang package and contains only one method named compareTo(Object).
 * 
 * A comparable object is capable of comparing itself with another object. 
 * The class itself must implements the java.lang.Comparable interface to compare its instances.
 * 
 * Reference: https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
 * */

import java.util.ArrayList;
import java.util.Collections;

public class JavaComparableInterface {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		Collections.sort(list);
		System.out.println("Movies after sorting : ");
		list.forEach(element->System.out.println(element));
	}

}

class Movie implements Comparable<Movie> {

	private String name;
	private double rating;
	private int year;

	/* Used to sort movies by year 
	 * When Collections.sort(?), call to compareTo on execution then it will call override method here
	 * As overriding method has higher priority over default API
	 * */
	
	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}

	public Movie(String name, double rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

}
