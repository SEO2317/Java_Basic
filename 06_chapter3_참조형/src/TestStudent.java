
public class TestStudent {
	
	
	public static void studentChange(Student s) { // 인스턴스 변수와 관계 없이 매개변수만으로 작업이 가능하다
		s.setAge(30);
	}

	public static void main(String[] args) {
		
	 Student s = new Student("홍길동",20,"서울");
	 System.out.println("변경전 나이:"+ s.getAge());//20
	 studentChange(s);
	 System.out.println("변경후 나이:"+ s.getAge());//30
		
	}
}

//다른 아이도 영향이 가서 바뀐다

//api중에서 import 안해도 되도 java.lang(자동으로 입력되게 된다)

//java.lang이 아닌 경우 import를 해야한다.