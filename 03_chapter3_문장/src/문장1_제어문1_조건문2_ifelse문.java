import java.util.Scanner;

public class 문장1_제어문1_조건문2_ifelse문 {

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
				 * 
				 * 
				 * 4) switch 문
				 * 
				 * 
				 * 
				 * 
				 */
		System.out.println("1");
		//조건이 true이며 2 출력하고 false이면 출력한다.
		
		if(true) {
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
		
		System.out.println("END");
		
	}

}
