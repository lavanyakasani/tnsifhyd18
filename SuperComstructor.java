package com.coreconcepts.superr;

public class Animal3SuperParentConstructor {
	
	Animal3SuperParentConstructor(){
		System.out.println("Animal is created");
	}
	
}
public class Animal3SuperChildConstructor extends Animal3SuperParentConstructor {
	
		Animal3SuperChildConstructor(){  
		super();  
		System.out.println("dog is created");  
		}  
		
		public static void main(String[] args) {
			
			Animal3SuperChildConstructor a3 = new Animal3SuperChildConstructor(); //object
			
		}


}
