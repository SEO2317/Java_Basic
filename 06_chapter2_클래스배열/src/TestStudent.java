//학생을 관리하기 
//이름 나이 주소 관리
//생성자 getter setter

//객체 생성
public class TestStudent {

	public static void main(String[] args) {
		
		//1.개별적인 변수로 관리
		Student s1 = new Student("홍길동1",20,"서울1");
		Student s2= new Student("홍길동2",20,"서울2");
		Student s3 = new Student("홍길동3",20,"서울3");
		Student s4 = new Student("홍길동4",20,"서울4");
		Student s5 = new Student("홍길동5",20,"서울5");
		
		//2.배열로 관리(변수 하나로 관리 되어 효율적이다.)
		Student [] stuArr = new Student[5];
		stuArr[0] = s1;
		stuArr[1] = s2;
		stuArr[2] = s3;
		stuArr[3] = s4;
		stuArr[4] = s5;
		
		//가.new 이용
		stuArr[0] = new Student("홍길동1",20,"서울1");
		stuArr[1] = new Student("홍길동2",20,"서울2");
		stuArr[2] = new Student("홍길동3",20,"서울3");
		stuArr[3] = new Student("홍길동4",20,"서울4");
		stuArr[4] = new Student("홍길동5",20,"서울5");
		
		
		for(Student s : stuArr) {
			System.out.println(s.getName());
		}
		
		//2. 값
		Student [] stuArr2 = {new Student("홍길동1",20,"서울1"),new Student("홍길동2",20,"서울2"),new Student("홍길동3",20,"서울3")
							  };
		
		for(Student s : stuArr2) {
			System.out.println(">>>"+s.getName());
		}
		
		//3.new + 값
		
		Student [] stuArr3 = {new Student("홍길동1",20,"서울1"),
								new Student("홍길동2",20,"서울2"),
									new Student("홍길동3",20,"서울3")
		  						};
		
		
		 for(Student s : stuArr3) {
			 System.out.println("###"+s.getName());
		 }

	}//end main
}
