
public class 문장2_제어문2_반복문1_for문 {

	public static void main(String[] args) {
		// 반복
		/*
		 * 1. for문
		 * 
		 * 	문법:
		 * 		for(초기값 ,조건식,증감식 ){
		 * 
		 * 		
		 * 
		 * 		
		 * 		}
		 * 		예> hello 문자열을 5번 출력하자.
		 * 		
		 * 		int n=1; // 변수 초기화
		 *		                 "Hello"
		 *		n++
		 *		n <= 5
		 *
		 *		for(int n=1; n <= 5; n++)
		 *		   System.out.println("Hello");
		 * 
		 * 2. while문
		 * 	=> 반복횟수 예측이 어려울때 주로 사용된다.
		 * 	      무한루프에서 주로 사용된다.
		 * 문법:
		 * 		초기값;
		 * 		while(조건식){
		 * 			문장;
		 * 			증감식;
		 * 	}
		 * 
		 * 3. do~ while 문
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		for(int n=1; n <= 5; n++) {
			System.out.println( "Hello" + n);
		}
		
		//while문
		
		  int n=1;
		  while(n <= 5) {
			  System.out.println( "World" + n);
			  n++;
		  }
		
		//중첩 가능
		/*
		 * 
		 * 	==> 모든 제어문은 중첩가능
		 * 	1.조건문 중첩
		 * 	if() {
		 * 		
		 * 		if(){
		 * 	}
		 * 
		 * 		for() {
		 * 
		 * 	}
		 * }
		 * 2.반복문 중첩
		 * 	for(){
		 * 	  for(){
		 * 		if(){
		 * 		}
		 * 	 }	
		 * }
		 * 
		 * 
		 */
		/*
		 * int x = 0; //누적용 for(int n=1; n <= 5; n++) { int num = 0; //반복할때마다 매번 생성
		 * num++; x++; System.out.println(n+ "Hello" +num+ "\t" + x); }
		 */
		
		
	} 	
}
