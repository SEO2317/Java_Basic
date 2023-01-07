//finally 문 정리
/*
 * 
 * 다음 문장은 예외처리는 불가능하지만
 * 반드시 수행되어야 하는 문장을 의도적으로 노출하기 위해서 사용한 것이다.
 * 
 * try{
 * 	실행코드;
 *  실행코드;
 *  
 *
 * }finally{
 * 	무조건 실행되어야 하는 문장 ==> 주로 외부자원(파일,DB) 사용할때 잘 사용했다고 알려주는 작업 (close() 지정)
 * 	}
 * 
 * 외부자원(파일,DB) 사용하는 프로세스
 * 1)외부자원을 사용하겠습니다.(초기화) ==> 생성자,static블록{}
 * 2)사용
 * 3)잘 사용했습니다. (자원반납)=> finally문
 * 
 * 
 * 
 * 
 */
 


public class TestMain6 {
 public static void main(String[] args) {
	System.out.println("Start");
	try {
		System.out.println("보편적인 코드");
	} finally {
		System.out.println("홍길동 출력");
	}
	System.out.println("Main 정상출력");
 	}//end main
}//end class


/*
 * 
 * 
 * 
 * public class TestMain4 {
 public static void main(String[] args) {
	//단일 catch문 
	 //다중 catch문
	 System.out.println("Start");
	 
	 try {
		 //가정1: ArithmeticException 발생가능한 코드
		 int num=0;
		 int result = 10/num;
		 System.out.println(result);
		 
		 //가정2: NullPointerException 발생 가능한 코드
		 String name = null;
		 System.out.println(name.length());
		 
	 }catch(ArithmeticException e) {
		System.out.println("예와발생1");
	 }
	 
	 System.out.println("Main 정상종료");
 	}//end main
}//end class

 * 
 * 
 * 
 * 
 * 
*/