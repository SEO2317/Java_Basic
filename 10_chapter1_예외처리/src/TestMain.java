//다형성 적용한 catch문 사용
public class TestMain {
 public static void main(String[] args) {
	//단일 catch문 
	 //다중 catch문==> 다형성을 이용한 Exception 클래스 + 단일  catch문 사용해도 되지만 권장 안함
	 System.out.println("Start");
	 
	 try {
		 int num=0;
	 int result = 10/num;
	 
//	 System.out.println(result);
//	 }catch(RuntimeException e) {
//		 System.out.println("0으로 나누어 예외발생");
//	 }
	 
 }catch(Exception e) {
	 System.out.println("0으로 나누어 예외발생");
 }
	 
	 System.out.println("Main 정상종료");
 	}//end main
}//end class
