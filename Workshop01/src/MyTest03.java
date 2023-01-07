
public class MyTest03 {

	public static void main(String[] args) {
		int n = 10;
		int n2 = 20;
		
		
//		 System.out.println("바꾸기 전");
//	      System.out.println("n값 : " + n + ", n2값: " + n2);
		
		int tmp  = 0;
		tmp = n;
        n = n2;
        n2 = tmp;
		
		System.out.println("n값은 " +n);
		System.out.println("n2값은" +n2);
	}

}
