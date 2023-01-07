//재사용 클래스

//잘못된 데이터가 저장될 수 있기 때문에 검증 작업 필요

public class Student {
	
	//은닉성: Student내의 변수 보호 목적
	private String name;
	private int age;
	private String address;
	public Student() {
		
	}
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//setAge 메서드내에서 검증작업 구현
	/*
	 * public void setAge(int age) { 
	 * 	if( age > 0 && age < 100) { 
	 * this.age = age;
	 * }else { 
	 * 	System.out.println("잘못된 age 입력"); 
	 * 	} 
	 * }
	 */
	
	//은닉성(encapsulation) : 외부 클래스 감소 목적
	private boolean ageCheck(int age) {
		boolean result = false;
		if(age > 0 && age < 100) {
			result = true;
		}
		return result;
		//조건에 따라 참인지 거짓인지 판별
	}
	
	public void setAge(int age) {
		if(ageCheck(age)) {
			this.age = age;
		}else {
			System.out.println("잘못된 age 입력");
		}
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//추가 메서드 직접 구현한다.
	
	
}
