
public class Cat extends Pet{  //자식은 부모의 기본 생성자가 없어서 오류 발생
 
	private String gender;

	//생성자
	
	public Cat() {
		super();
		
	}

	public Cat(String name, int age) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		//부모에서 선언했기 때문에 부모에서 초기화하기 위해서
		
	}

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
