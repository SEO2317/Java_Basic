package com.abstract2;

public class TestPet {
	public static void main(String[] args) {
//		Pet p = new Pet();  추상클래스인데 안써서 오류 발생 객체 생성 안됨
		Pet p = new Cat();
			p = new Dog();
		Cat c = new Cat();
		c.eat();
		Dog d = new Dog();
		d.eat();
	}
}
