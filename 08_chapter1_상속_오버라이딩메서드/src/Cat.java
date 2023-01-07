
public class Cat extends Pet {

	//의존적인 속성
	String gender;

	//의존적인 동작
	public void cryCat() {
		System.out.println("Cat.cryCat");
	}
	
	//재정의
//	@Override //어노테이션
	public void eat() {
		System.out.println("냠냠~");
	}
	
	
	
	//재정의
//	@Override //어노테이션
	public void sleep() {
		System.out.println("쿨쿨~");
	}

	public Cat() {
		super();  //Pet 기본 생성자 호출
		
	}

	
	public Cat(String name, int age) {  //Pet의 이름 나이 호출
		super(name, age);
		
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}
}
