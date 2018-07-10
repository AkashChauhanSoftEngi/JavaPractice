package com.project.java;

public class PolymorphismExample {

	public static void main(String[] args) {
		PolymorphismExample obj = new child();
		if((obj.addTwo(1, 2))==5){
			System.out.println("It is a child Method");
			System.out.println("Here object 'obj' can access both two methods with same name addTwo(int,int)");
		}
	}
	
	public int addTwo(int i,int j){
		return i+j;
	}

}

class child extends PolymorphismExample{
	
	public int addTwo(int i,int j){
		return i+j+2;
	}
}
