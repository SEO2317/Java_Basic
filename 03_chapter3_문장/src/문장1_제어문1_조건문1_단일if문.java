
public class 문장1_제어문1_조건문1_단일if문 {

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
		 * 
		 * 
		 * 
		 * 3)다중 if문
		 * 
		 * 4)switch 문
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println("1");
		if(false) {
			System.out.println("2");
			System.out.println("3");
		}
		System.out.println("end");
		
		
		////////////////////
		// 변수와{} 관계
		if(true) {
			int num = 10;
//			num = 10;
			System.out.println(num);
		}
		
	}

}
