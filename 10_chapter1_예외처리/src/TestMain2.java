//
public class TestMain2 {
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
	 }
	 
	 System.out.println("Main 정상종료");
 	}//end main
}//end class
