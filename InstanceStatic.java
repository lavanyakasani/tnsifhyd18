package com.staticinstance;

public class InstanceDemo {
	
	static int a = 13; //static variable
	 int b = 1199; //instance variable
	 void callme() //instance method
	{
	System.out.println("The value of b = " + a); //instance method can access static variable
	System.out.println("The value of k = "+ b); // instance method can access instance variable 
	}

}
public class TestThisInstance {
	
	public static void main(String args[]) 
	{
	 
	InstanceDemo id = new InstanceDemo();
	 //Instance method is being called using the object of the class
	id.callme();
	 //Static variable is accessed with the class name
	System.out.println("The value of a = " + InstanceDemo.a);
	System.out.println();

	}

}
