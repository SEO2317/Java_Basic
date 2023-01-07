import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.이름을 입력하시요  ");
		String name = sc.next();
		System.out.println(name);
		
		System.out.println("2.나이를 입력하세요  ");
		int age = sc.nextInt();
		System.out.println(age);
		System.out.printf("이름은 %s,나이는 %d", name, age);
		
	}

}
