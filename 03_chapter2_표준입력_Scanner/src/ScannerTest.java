import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		//Scanner 클래스 이용한 키보드 입력값 얻기
		/*
		 * 	1. 기본적으로 키보드에서 입력 데이터는 문자열로 모두 문자열로 처리한다.
		 * 	2. Scanner는 숫자용 메서드가 제공되고
		 * 				문자용 메서드가 제공되고
		 * 
		 * 	Scanner sc = new Scanner(System.in);
		 * 	int n =  sc.nextInt();  //숫자
		 * 
		 * 	Scanner sc = new Scanner(System.in);
		 * 	String m =  sc.nextLine(); //
		 *  
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시요  ");
		int age = sc.nextInt();
		System.out.println(age+"세");
	}

}
