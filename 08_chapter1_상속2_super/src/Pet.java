
public class Pet {

	
	public String name; //String name
	public int age;     //int age
	
	
	
	public Pet(String name, int age) {
		super(); //부모의 생성자 호출
		this.name = name;
		this.age = age;
	}



	//name과 age를 한꺼번에 반환해주는 메서드
	public String getInfo() {
		return name + "\t" +age + "\t" ;
	}
}
