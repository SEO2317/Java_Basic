//student 클래스 핸들링
public class TestStudent {

	public static void main(String []args) {
		
		Student s = new Student("홍길동",20,"서울");
		
		//홍길동의 나이 수정 ==> 나이값을 잘못 지정했을 때 검증 기능이 필요하다.
		s.setAge(-100);
		
		
	
		
		Student s2 = new Student("이순신",44,"제주");
		
		//두명의 학생 정보 출력
		System.out.printf("\n이름 %s, 나이%d 주소 %s ", s.getName(),s.getAge(),s.getAddress());
		
		String name = s2.getName();		
		String address = s2.getAddress();	
		int age = s2.getAge();
		
		System.out.printf("이름 %s, 나이%d 주소 %s ",name,address,age);
		
		
	
	}
	
	
}
