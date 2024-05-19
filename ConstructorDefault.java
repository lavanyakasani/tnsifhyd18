package com.oop1.constructor;

public class Car1Default {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car1Default() {
		doors = "closed";
		engine = "on";
		driver= "seated";
		speed = 10;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}
		else{
			return "car is not running";
		}
	}

}
public class Car1Main {
	
	public static void main(String[] args) {
		Car1Default c1 = new Car1Default();
		System.out.println(c1.run());
	}

}
