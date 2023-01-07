
public class VariableTest3 {
	
	String name; //static없기 때문에 인스턴스 변수
	static String address; //static 있기 때문에 클래스(static) 변수 
	/*
	 * 
	 */
	
	public static void main(String[] args) { //args는 로컬변수
	//변수 사용시 주의할 점
	
	//1. 동일한 이름 사용 불가
	int age = 20; //로컬변수
//	String age = "aa";
	
	//2. 변수 종류 3가지 중에서 로컬변수는 반드시 사용전에 초기화해야 된다.
	/*
	 * 변수 종류 3가지(*************)
	 * 1)로컬변수(local variable)
	 * - 메서드 안에서 선언
	 * - 저장되는 메모리명: 스택(stack)
	 * - 변수의 삶(variable lifecycle)은
	 *   메서드가 호출될 때 생성 ~ 메서드가 끝나면 제거된다.
	 *   (자동으로 호출되는 유일한 메서드가 main 메서드 , 역으로 main 메서드를
	 *   제외한 메서드는 반드시 호출되야 수행된다.)
	 *   -주의할 점은 반드시 사용전에 초기화해야 된다.
	 *   
	 *  
	 * 2)인스턴스 변수(instance variable)
	 * - 메서드 밖에서 선언
	 * - 저장되는 메모명 : 힙(heap)
	 * - 변수의 삶(variable lifecycle)
	 * 	 객체가 생성될 때 생성 ~ 객체(클래스)가 소멸될 때 제거된다.
	 * ==> 클래스 생성 문법 : new 클래스명();
	 * - 초기화하지 않아도 자동으로 초기화된다.
	 * 정수 : 0
	 * 실수 : 0.0
	 * 논리 : false
	 * 문자 : /u000
	 * 
	 * 참조: null
	 * 
	 * 
	 * 
	 * 3)클래스변수(class variable, static variable)
	 * - 메서드 밖에서 선언 + static 키워드 지정
	 * - 저장되는 메모리명: method area
	 * - 변수의 삶(variable lifecycle)
	 * 	프로그램 실행할 때 생성 ~ 프로그램 종료될 때 제거된다.
	 */
	int num=100;
	String address; //로컬변수, 참조형변수, String타입 변수
	
	System.out.println(num); //로컬변수인데 초기화가 되어서 에러가 난다.
// System.out.println(address); //로컬변수인데 초기화 안되어서 컴파일 에러가 난다.
	
	
	//3. 변수 스코프(scope) => 변수를 사용할 수 있는 범위 의미. 기본적으로 블럭(scope)
	//자바 언어는 변수가 블럭 scope를 따른다고 말한다.
	char c1 = 'A';
	{
		char c2 = 'B';
		System.out.println(c1);
		System.out.println(c2);
		
	}
	
	
	}//main 메서드 블럭({})
}//class 블럭({})
