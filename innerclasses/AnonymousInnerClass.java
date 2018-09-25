package com.project.java.innerclasses;

/*
 * Here demo act as super class and anonymous class acts as a subclass, both classes have a method show()
 * In anonymous class show() method is overridden
 * */
class Demo {
	void show() {
		System.out.println("i am in show method of super class");
	}
}

interface Hello {
	void show();
}

public class AnonymousInnerClass {
	// An anonymous class with Demo as base class
	static Demo d = new Demo() {
		void show() {
			super.show();
			System.out.println("i am in Flavor1Demo class");
		}
	};

	static Hello h = new Hello() {

		@Override
		public void show() {
			System.out.println("i am in anonymous class");
		}
	};

	public static void main(String[] args) {
		d.show();
		h.show();
	}
}
