public class 연산자1_산술연산자 {

	public static void main(String[] args) {
		// 산술 연산자 : + - * /(몫) %(나머지)
		
		int n = 10;
		int n2 = 3;
		int result = n + n2; //실행결과를 필요에 의해서 새로운 변수에 저장도 가능하다.
		
		//두개다 int라서 정수로 출력
		
		System.out.println(n+n2); //13
		System.out.println(n-n2); //7
		System.out.println(n*n2); //30
		System.out.println(n/n2); //3(정수값)
		System.out.println(n%n2); //1
		
		int x = 10;
		double x2 = 3;
		System.out.println(x/x2);//작은타입에서 큰타입으로 나누면 큰타입으로 나와 결과는 3.3333333333333335(실수)
//		System.out.println(10/3.0);
		System.out.println(10/3.);
		
		
		//연결 연산자 : + ==> 문자열과 값(문자열,비문자열)을 + 했을때는 연결이 된다.
		// 			  => 용도 :  여러개의 값을 하나의 값(문자열)으로 만들 때 사용한다.
		
		
		String name = "홍길동";
		int age = 20;
		
		String result2 = name + "\t" + age;
		System.out.println(result2);
		
	}

}
