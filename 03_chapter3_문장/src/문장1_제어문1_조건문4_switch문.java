import java.util.Scanner;

public class 문장1_제어문1_조건문4_switch문 {

	public static void main(String[] args) {
		//조건문(분기문)
				/*
				 * 1)단일 if문
				 * 
				 * 	==>용도: 조건이 참(true)경우에만 문장을 실행시킬때 사용
				 * 	
				 * 		문장1;
				 * 
				 * 		if(조건식){
				 * 		  문장2; 중괄호를 쓰는것이 관례 
				 * 		}
				 * 		문장3;
				 * 
				 * 	예>
				 * 	if(n > 20){
				 * 	  ...
				 * 	}
				 * 	문장n;
				 * 
				 * 	==> {} 생략하면 바로 뒤 하나의 문장만 영향을 받는다.
				 * 
				 * 2)if-else문
				 * => 용도: 조건에 따라 실행하는 문장이 달라질 때 사용
				 * ==> 문법:
				 * if(조건식){  // 조건이 참인지 거짓에 따라 문장이 달라진다.
				 * 	 문장2
				 * }else{
				 * 	 문장2-1;
				 * }
				 * 문장3;
				 * 
				 * 
				 * 3)다중 if문
				 * 	=> 용도 : 조건이 여러개인 경우에 사용
				 * 	 ==> 문법:
				 * 
				 * 	  문장1;
				 * 
				 * 	 if(조건식) {
				 * 		 문장2;
				 * 	 }else if(조건식2){
				 * 		 문장3;	
				 * 	 }
				 * 
				 * 	 }else if(조건식3){
				 * 		 문장4;	
				 * 	 }
				 * 
				 * 	 }else{
				 * 		 문장5;	
				 * 	 }
				 * 4)switch 문  // ==로인하여 비교
				 * ==> 용도 : 조건이 여러개인 경우에 사용
				 * ==> 문법:
				 * 
				 *  	switch(변수){
				 *  		case 값1: 문장1;
				 *  		case 값2: 문장2;
				 *  		case 값3: 문장3;
				 *  		default: 기본문장;
				 *  	}
				 * 		//break를 사용하면 원하는 조건의 문장만 출력이 된다.
				 * 		==>변수와 값의 비교는 내부적으로 == 으로 비교한다.
				 * 
				 * 		==>switch문에서 사용가능한 데이터 타입
				 * 
				 * 		byte - 0
				 * 		short - 0
				 * 		int - 0
				 * 		long - X
				 * 
				 *  	float - x
				 *  	double -x
				 *  	char - 0
				 *  	boolean - x
				 *  
				 *  	String - 0
				 *  	enum 타입 - 0
				 *  
				 *  	switch문에서 지원하지 않은 데이터 타입인 경우에는
				 *   	그냥 다중 if문을 사용하면 된다.
				 * 		
				 * 
				 * 
				 *      //default와 break 필수적이지는 않지만 넣는게 관례이다.
				 * 
				 * 		
				 */
				 char num = 10;
				 
				 switch(num) {
				 case 10: System.out.println("10 출력");
				 	break;
				 case 5: System.out.println("5 출력");
				 	break;
				 case 15: System.out.println("15 출력");
				 	break;
				 default: System.out.println("default");
				    break;
				 }
		
				 String s = "A";
				 switch (s) {
				case "A":
					
					break;

				default:
					break;
				}
	}

}
