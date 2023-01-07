//다중 catch문 정리
//주의할 점 반드시 계층구조기 낮은 예외클래스부터 catch하고 가장 마지막에 Exception으로 catch한다.
 


public class TestMain4 {
 public static void main(String[] args) {
	//단일 catch문 
	 //다중 catch문
	 System.out.println("Start");
	 
	 try {
		 //가정1: ArithmeticException 발생가능한 코드
		 int num=2;
		 int result = 10/num;
		 System.out.println(result);
		 
		 //가정2: NullPointerException 발생 가능한 코드
		 String name = null;
		 System.out.println(name.length());
		 
	 }catch(ArithmeticException e) {
		System.out.println("예와발생1");
 	}catch(NullPointerException e) {
		System.out.println("예와발생2");
 	}catch(Exception e) {
		System.out.println("위에서 catch못한 여기서 잡기위한 목적,예와발생3");
	 }
	 
// 	}catch(Exception e) {
//		System.out.println("예와발생1");
//	 }
	 
	 System.out.println("Main 정상종료");
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