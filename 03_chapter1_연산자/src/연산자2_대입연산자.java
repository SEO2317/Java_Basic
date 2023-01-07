public class 연산자2_대입연산자 {

	public static void main(String[] args) {
		/*
		 * 
		 * 	n=n2 ==> n2값을 n에 대입(저장)		 
		 * 	n+=n2 ==> n와 n2값을 더해서 더한 결과를 n에 대입(저장)
		 * 				n = n + n2 동일		 
		 * 	n-=n2 ==> n와 n2값을 빼서 결과를 n에 대입(저장)
		 * 				n = n - n2 동일			 
		 * 	n*=n2 ==> n와 n2값을 곱해서 결과를 n에 대입(저장)
		 * 				n = n * n2 동일	 
		 * 	n/=n2 ==> n와 n2값을 나누고 몫 결과를 n에 대입(저장)
		 * 				n = n / n2 동일	 		 
		 * 	n%=n2 ==> n와 n2값을 나누고 나머지 결과를 n에 대입(저장)
		 * 				n = n % n2 동일
		 * 	 
		 * 
		 * */
		
		int n = 10;
		int n2 = 3;
		
		n += n2;
		System.out.println(n+ "\t" + n2); //13 3
		n -= n2;
		System.out.println(n+ "\t" + n2); //10 3
		n *= n2;
		System.out.println(n+ "\t" + n2); //30 3
		n /= n2;
		System.out.println(n+ "\t" + n2); //10 3
		n %= n2;
		System.out.println(n+ "\t" + n2); // 1 3
	} 
}
