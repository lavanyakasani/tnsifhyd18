package com.oop2.inheritence;

public class HierarchialInheritenceA {
	
	public void display() {
		System.out.println("I am method from class A");
	}

}
public class HierarchialInheritenceB extends HierarchialInheritenceA {
	
	public void print() {
		System.out.println("I am a method from class B");
	}

}
public class HierarchialInheritenceC extends HierarchialInheritenceA{
	
	 public void show() {
		 System.out.println(" I am a method from class C");
	 }

}
public class HierarchialInheritenceD extends HierarchialInheritenceA{
	
	public void output() {
		System.out.println("I am a method from class D");
	}

}
public class HierarchialMain {
	
	public static void main(String[] args) {
		HierarchialInheritenceB b1 = new HierarchialInheritenceB();
		HierarchialInheritenceC c1 = new HierarchialInheritenceC();
		HierarchialInheritenceD d1 = new HierarchialInheritenceD();
		
		b1.display();
		c1.display();
		d1.display();
	}

}
