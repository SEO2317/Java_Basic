import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("1부터 n까지의 총합 구하기");
		Scanner sc =  new Scanner(System.in);
		int n = 0;
		int sum = 0;
		do {
			System.out.print("n값 :");
		}while(n<=0);
			for(int i=1; i<=n; n++) {
				sum+=i;
			}
		System.out.printf("1부터 %d까지 총합:%d",n,sum);
	}	
}
