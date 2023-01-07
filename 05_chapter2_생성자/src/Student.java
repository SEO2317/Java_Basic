/*
 * 
 * 클래스 문법
 * -클래스가 자바 프로그램의 최소단위.
 * -클래스명은 사용자 정의 식별자이다.
 *  권장: 첫글자 대문자이고 명사형으로 지정한다.(명명법:naming convention)
 * 문법:
 * 
 * 
 * 
 * 
 *  public class 클래스명{
 *  
 *  	//3가지 구성 요소
 *  	//1)변수(인스턴스변수, static 변수)
 *  		==>데이터 저장
 *  	//2)메서드(method)
 *  		==>변수값 변경 및 조회
 *  	//3)생성자(constructor)
 *  		==>  변수 초기화
 *  
 *  
 *  }
 *  
 *  2)생성자(constructor)
 *  ==> 메서드 처럼 호출해야 수행이되고
 *  	끝나면 호출 하는 곳으로 돌아온다.(method-like)
 *  ==> new 할때 호출해서 수행이 된다.
 *  ==> 문법
 *  
 *  	public 클래스명 {
 *  	
 *  	}
 *  
 *  	클래스명 변수 =  new 클래스명();
 *  	 ==> new 뒤에 클래스명() 코드가 생성자를 호출하는 코드이다
 *   	   Student 클래스에 생성자가 없으면 자동으로 생성해준다.
 *   	   자동으로 생성된 생성자를 ; 기본형성자(default 생성자)' 부른다.
 *        모든 클래스는 생성자가 명시적으로 없으면 기본생성자는 항상 자동으로 제공된다.
 * 		    역으로 명시적으로 있으면 기본 생성자는 자동으로 제공안됨
 * 
 * 		==>오버로딩(overloading) 생성지가 가능하다
 * 		:? 오버로딩
 * 		인자리스트가 다른 생성자를 의미한다.
 * 	    public Student(){} //파라미터 없고
 * 	    public Student(int n){} //파라미터 하나인데 타입에따라 구분 가능
 * 	    public Student(String n){}//파라미터 하나인데 타입에따라 구분 가능
 * 	    public Student(int n, String x){}//파라미터 두개인데 타입에따라 구분 가능
 * 	    public Student(String x, int n){}//파라미터 두개인데 타입에따라 구분 가능
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Student {
	
	//인스턴스 변수(객체 속성 저장할때)
	String name;
	int age;
	String address;
	
	//기본 생성자는 무조건 만들고 나중에 필요한 생성자를 추가하자
	public Student() {
		
	}
	
	public Student(String n, int a, String addr) {
		System.out.println("Student");
		name = n;
		age = a;
		address = addr;
	}
	
	public Student(String n, int a) {
		System.out.println("Student");
		name = n;
		age = a;
	}
	
	public Student(String n) {
		System.out.println("Student");
		name = n;
	}
	
	
}
