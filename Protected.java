package com.coreconcepts.accessmodifiers;

public class ProtectedA {
	
	protected void display() {
		System.out.println("TNS Sessions");
	}

}
public class Protected2Main extends ProtectedA {
	
	public static void main(String[] args) {
		
		Protected2Main p3 = new Protected2Main();
		p3.display();
		
	}

}
