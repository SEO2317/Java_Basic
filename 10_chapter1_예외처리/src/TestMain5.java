//finally 문 정리
/*
 * 
 * try{
 * 	실행코드;
 *  실행코드;
 *  
 * }catch(){
 * 예외발생시 처리코드
 * }catch(){
 * 예외발생시 처리코드
 * }finally{
 * 	예외발생여부와 상관없이 무조건 실행되어야 하는 문장
 * 	}
 * }
 * 
 * 
 * 
 */
 


public class TestMain5 {
 public static void main(String[] args) {
	 System.out.println("Start");
	 
	 try {
		 //가정1: ArithmeticException 발생가능한 코드
		 int num = 0;
		 int result = 10 / num;
		 System.out.println(result);
		 
		 //가정2: NullPointerException 발생 가능한 코드
		 String name = null;
		 System.out.println(name.length());
 	}catch(ArithmeticException e) {
		System.out.println("예와발생1");
 	}catch(Exception e) {
		System.out.println("위에서 catch못한 여기서 잡기위한 목적,예와발생3");
	 }finally {
		System.out.println("반드시 수행되는 문장");
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