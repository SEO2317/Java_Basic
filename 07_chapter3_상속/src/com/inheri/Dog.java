package com.inheri;

public class Dog extends Pet {
	//공통속성
	
	//의존적인 속성
	private String gender;

	public Dog() {
		
	}

	public Dog(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	//공통적인 동작
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//의존적인 동작
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
