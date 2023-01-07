import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.정수 입력하시요  ");
		int num1 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("2.정수 입력하시요 ");
		int num2 = sc.nextInt();
		int result =  num1 + num2;
		System.out.println(num2);
		System.out.printf("정수 %d과,정수 %d의 합계%d", num1, num2, result);
		
	}

}
