public class VariableTest {

	public static void main(String[] args) {
		
		// 변수 사용
		//저장할 데이터는 
		/*
		 * "홍길동" 문자열, String
		 * 20		정수, byte,short,int,long
		 * "서울"   문자열, String
		 * 175.4     실수
		 * 76.32    실수
		 * true   논리
		 * 
		 */
		//1. 변수 선언 => 데이터타입 변수명;
		//변수명 모두 소문자, 의미있는 명사형
		String name;
		 int age;
		 String address;
		 float height;
		 double weight;
		 boolean isMarried;
		 
		 //2.변수 초기화  ==> 변수에 맨 처음 값을 저장하는 작업의미
		 //문법: 변수명 = 값;
		 
		 name = "홍길동";
		 age = 20;
		 address = "서울";
		  height = 175.4f; //데이터 타입에 FLOAT이면 F를 붙인다
		  weight = 76.32; //데이터타입
		  isMarried = true;
		  
		  System.out.println("이름:"+name);
		  System.out.println("나이:"+age);
		  System.out.println("주소:"+address);
		  System.out.println("키:"+height);
		  System.out.println("체중:"+weight);
		  System.out.println("결혼여부:"+isMarried);
		  
		  
		  System.out.println("나이1:"+20+" " + age);
		  System.out.println("나이2:"+20+" " + age); //변수하나만 저장해놓고 값을 변경할때 유용하다
		
		//변수 : 값 변경이 가능하다
		  age = age + 1;
		  System.out.println("내년나이:"+age);
		  System.out.println("이사갈 주소:" +address);
		  
		  //초기화 및 값 변경할 때에는 데이터 타입이 일치되어야한다
		  

	}

}
