import java.util.Scanner;

public class 문장1_제어문1_조건문1_단일if문2_실습 {

	public static void main(String[] args) {
		//문제
		//키보드로 숫자를 입력받아서 짝수이면 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		boolean result = (num%2)==0;
		
		
		
//		if(result) {
//			System.out.println("num");
//		}
		
		if((num%2)==0) {
		System.out.println("짝수");
		}
		
		
		
		System.out.println("END");
		
	}

}
