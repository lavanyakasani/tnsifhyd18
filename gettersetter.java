package com.oop;

public class Car2getterssetters {
	
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
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
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	

}
public class Main2getterssetters {
	
	public static void main(String[] args) {
		Car2getterssetters c2= new Car2getterssetters();
		c2.setSpeed(40);
		System.out.println(c2.getSpeed());
		
		
		c2.setDoors("Closed");
		System.out.println(c2.getDoors());
		
		
	}

}
