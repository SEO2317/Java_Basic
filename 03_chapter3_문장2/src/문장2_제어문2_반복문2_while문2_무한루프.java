import java.util.Scanner;

public class 문장2_제어문2_반복문2_while문2_무한루프 {

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
		 * 
		 * 
		 * 3. do~ while 문
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		/*
		 * // for(int n=1; n <= 5; n++) { // System.out.println( "Hello" ); // } // //
		 * for(int n=0; n < 10; n++) { // System.out.println( "World" ); // } // //
		 * for(int n=5; n > 0; n--) { // System.out.println( "Happy" ); // } // //
		 * for(int n=1; n < 10; n+=2) { // System.out.println( "BBB" ); // } // //
		 * for(int n=1,m=1; n < 10 && m < 2; n+=2,m++) { // System.out.println( "ccc" );
		 * // }
		 */		
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
		 * // int x = 0; //누적용 // for(int n=1; n <= 5; n++) { // int num = 0; //반복할때마다
		 * 매번 생성 // num++; // x++; // System.out.println(n+ "Hello" +num+ "\t" + x); //
		 * } //
		 */
		/*
		 * 
		 * 
		 * 무한루프 코드
		 * 
		 * while(true){
		 * 	
		 *   문장;
		 * 
		 * 	 if(무한루프에서 빠져나올조건식) break;
		 *   //무한루프에 빠져나올때 break문을 사용한다.
		 * }
		 */
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력하시오. 중지하려면 99입력하시여");
			int num = sc.nextInt();
			////////////////////////////
			if(num==99)break;
			///////////////////////////
			System.out.println("입력값:" +num);
		}
	}//end main 	
}
