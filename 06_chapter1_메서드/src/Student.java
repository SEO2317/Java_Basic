//재사용 클래스


public class Student {

	//인스턴스 변수	
	//private을 한 이유는 잘못된 데이터 전달하기 않기 위해 -> 우회해서 접근 했다.
	private String name;
	private int age;
	private String address;
	
	//생성자
	public Student() {
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//getter ==> 권장 메서드명 get변수명으로 지정한다.
	//		 ==> 두번째 단어는 첫글짜는 대문자로 지정한다.(camel 표기법)
	//worker 메서드
	//name
	public String getName() {
		return name;
	}
	
	//age
	public int getAge() {
		return age;
	}
	
	//address
	public String getAddress() {
		return address;
	}
	
	//worker 메서드
	//setter ==> 권장 메서드명 set변수명으로 지정한다.
//			 ==> 두번째 단어의 첫글자는 대문자로 지정한다.
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	//address 
	public void setAddress(String addr) {
		this.address = addr;
	}
	
	
	
	
	
	
	
}
