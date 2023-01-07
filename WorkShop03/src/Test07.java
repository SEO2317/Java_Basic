import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i*num<=100;i++) {
			sum += num*i;
		}
		System.out.println(sum);
	}
}
