public class 연산자3_비교연산자 {

	public static void main(String[] args) {
		/*
		 * 
		 * 	n == n2 : n이 n2과 같냐?		 
		 * 	n != n2 : n이 n2과 같지 않냐?
		 *  n > n2 : n이 n2보다 크냐?
		 *  n >= n2 : n이 n2보다 크거나 같냐?
		 *  n < n2 : n이 n2보다 작냐?
		 *  n <= : n이 n2보다 작거나 같냐?
		 * */
		
		int n = 10;
		int n2 = 3;
		
		boolean result = n == n2;
		boolean result2 = (n==n2);
		System.out.println(result);
		
		System.out.println(n==n2);
		System.out.println(n!=n2);
		System.out.println(n>n2);
		System.out.println(n>=n2);
		System.out.println(n<n2);
		System.out.println(n<=n2);
	}

	int tmp  = 0; 
}
