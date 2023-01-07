package com.abstract2;

public abstract class Pet {

	String name; //변수
	
	public String getName() {
		return name;
	}
	public Pet() {} //일반생성자
	
	public abstract void eat(); //추상메서드
}

 //추상클래스에서는 abstract 써야 에러 발생하지 않는다