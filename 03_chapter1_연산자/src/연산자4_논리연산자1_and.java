public class 연산자4_논리연산자1_and {

	public static void main(String[] args) {
		
		//논리연산자: ==> && (앰퍼센트), || , !
		
		
		/*
		 * 1. && (그리고) 두개 만족해야 참 나머지는 거짓
		 * 
		 * true && true ==> true
		 * true && false ==> false
		 * false && true ==> false
		 * false && false ==> false
		 * 
		 * 예>
		 * 연산식 && 연산식
		 * ( 3==4) && ( 3 >5 )
		 * 
		 * */
		
		
		
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		System.out.println(( 3==4) && ( 3 > 5 ));
		
		int num = 3;
		int num2 = 4;
		System.out.println((num==num2) && ( num >5 )); //일반적인 논리연산자 사용형태
	
		//실습
		int x = 10;
		int x2 = 20;
		
		
		//문제1: x값이 15보다 크고 x2보다 작냐?
		boolean result = ((x>15) && (x<x2));
		System.out.println(result);
		System.out.println((x>15) && (x<x2));
		
		
	}

	
}
