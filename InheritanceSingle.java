package com.oop2.inheritence;

public class SingleLevelA {
	
	public void display() {
		System.out.println("I am a method from class A");
	}

}
public class SingleLevelB extends SingleLevelA{
	
	public void print() {
		
		System.out.println("I am a method from class B");
	}
	
	public static void main(String[] args) {
		
		SingleLevelB obj = new SingleLevelB();
		obj.display();
		obj.print();
		
	}

}
