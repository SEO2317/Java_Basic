public class 연산자5_증감연산자 {

	public static void main(String[] args) {
		
		//증감연산자 : ==> ++, --
		/*
		 * ++n : 전치연산자
		 * ++n : 후치연산자
		 * 
		 * ==> 독자적으로 사용하면 전치와 후치 차이가 없다.
		 * 
		 * 변수 = ++n:
		 * 	=> 먼저 증가하고 나중에 변수에 할당(저장)
		 * 
		 * 변수 = n++:
		 * 	=> 먼저 할당하고 나중에 증가한다
		 * 
		 * 	=> 따라서 다른 연산자와 같이 사용하면 변수값이 달라진다.
		 * 
		 */
		//1. 증가 연산자
		int n = 10;
		System.out.println(n);
//		++n; // n = n + 1; 동일
		n++; // n = n + 1; 동일	
		System.out.println(n);
		
		// n++한 결과를 새로운 변수에 저장하자
		int m = 10;
//		int new_m = ++m; m:11, new_m:11
		int new_m = m++;
		System.out.printf("m:%d, new_m:%d", m,  new_m);
		
	
		
		

		
		
		
	}
}
