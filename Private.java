package com.coreconcepts.accessmodifiers;

public class PrivateA {
	
	private void display()
	{
	System.out.println("TNS Sessions");
	}
}
public class PrivateMain {
	
	public static void main(String[] args) {
		PrivateA a1 = new PrivateA();
		a1.display();
	}

}
