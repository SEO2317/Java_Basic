//예외발생됨 ==> 비정상종료 코드를 정상종료하도록 예외처리하는 방법
/*
 * 
 * try {
 * }catch(ArithmeticException Excepion e){
 * 	예외처리 코드문장
 * }
 * 
 * 
 * 
 */
public class TestMain3 {

	public static void main(String[] args) {
		
		System.out.println("main 시작");
		try {
			int num = 0;
			int result = 10/num;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("main end: 정상종료");  //제대로 된 제외클래스를 사용해야 한다.
		}	

	}//end main

}//end class