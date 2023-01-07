//catch문의 예외클래스 메서드 2개
/*
 * 
 *  System.out.println(e.getMessage()); // /by zero
	e.printStackTrace(); //개발자가 디버깅할때 (catch 안에만 쓸수있다.)
 * 
 * 
 * 
 */
public class TestMain3 {
 public static void main(String[] args) {
	//단일 catch문 
	 //다중 catch문
	 System.out.println("Start");
	 
	 try {
		 int num=0;
		 int result = 10/num;
		 System.out.println(result);
		 
	 }catch(ArithmeticException e) {
		 System.out.println("0으로 나누어 예외발생");
//		 System.out.println(e.getMessage()); // /by zero
		 e.printStackTrace(); //개발자가 디버깅할때 (catch 안에만 쓸수있다.)
	 }
	 
	 System.out.println("Main 정상종료");
 	}//end main
}//end class
