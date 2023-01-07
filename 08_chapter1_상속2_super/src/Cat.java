
public class Cat extends Pet {

	String gender;

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	//오버 라이딩 메서드
	@Override
	public String getInfo() {
		// char c = 'A' 또는 String c2 = "A";
//		return name + "\t" +age + "\t" +gender;
		return super.getInfo() + "\t" +gender; //super. 멤버 호출
	}
	
	//오버 로딩 메서드
	public String getInfo(int n) {
		return null;
	}
	
	
}
