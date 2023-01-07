import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("주소를 입력하시오");
		Scanner sc = new Scanner(System.in);
		String doname= sc.next();
		String siname= sc.next();
		String guname = sc.next();
		System.out.printf("도명: %2s\n",doname);
		System.out.printf("시명: %2s\n",siname);
		System.out.printf("구명: %2s\n",guname);
	}

}
