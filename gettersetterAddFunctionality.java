package com.oop;

public class Car3getterssetterAddfunctinality {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDrivers(String drivers) {
		this.driver = drivers;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}

}
}
public class Main3getterssettersAddfunctionality {
	
	public static void main(String[] args) {
		Car3getterssetterAddfunctinality car = new Car3getterssetterAddfunctinality ();
		car.setSpeed (10);
		car.setDoors ("closed");
		car.setEngine ("on");
		car.setDrivers ("seated");
		//calling the function
		System.out.println (car.run ());
	}

}
