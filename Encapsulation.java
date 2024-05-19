package com.oop3.encapsulation;

public class Encapsulation4 {
	
	private String name;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public boolean setAge(int age) {
		if (age >=0 && age <=100){
			this.age = age;
			return true;
			}
			return false;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
public class Encapsulation4Main {
	
	public static void main(String[] args) {
		Encapsulation4 e4 = new Encapsulation4();
		e4.setAge(25);
		e4.setGender("Male");
		e4.setName("John");
		
		System.out.println(e4.getAge());
		System.out.println(e4.getGender());
		System.out.println(e4.getName());
		
	}

}
