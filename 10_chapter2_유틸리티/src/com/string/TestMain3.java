package com.string;


/*
 * 문자열 생성 방법
 * ==> 문자열 String 클래스 관리(변수/상수,메서드,형성자)
 * 
 * 1.리터럴 이용
 * 
 * 
 * 
 * 
 */
class Cat{
	String name;
	public Cat(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class TestMain3 {

	public static void main(String[] args) {
		Cat c = new Cat("야옹이");
		Cat c2 = new Cat("야옹이");
		
		System.out.println(c);
		System.out.println(c2);
		
		//c외 c2가 같냐?
		//1.주소값이 같냐?
		System.out.println(c==c2);
		
		
		//2.실제값이 값냐
		System.out.println(c.equals(c2)); //Object의 equals메서드를 사용했기때문에 == 비교됨
		
		//실제값 비교할려면 재정의해야한다.(API 대부분이 미리 재정의)

	}

}
