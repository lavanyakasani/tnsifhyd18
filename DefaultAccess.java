package com.coreconcepts.accessmodifiers;

public class DefaultA {
	
	void display() {
		System.out.println("TNS sessions");
	}

}
public class DefaultMain {
	
	public static void main(String[] args) {
		DefaultA d1 = new DefaultA();
		d1.display();
	}

}
