import java.util.Scanner;

public class 문장2_제어문2_반복문3_dowhile문 {

	public static void main(String[] args) {
		/*
		 * 
		 * 반복문에서 사용 가능한 2가지 리워드
		 * 
		 * 1.break
		 * 	=> 가장 가까운 반복문을 빠져 나온다.
		 * 	=> 문법:
		 * 		if(조건)break;
		 * 
		 * 2.continue
		 * => 가장 가까운 반복문의 끝( } ) 으로 가서
		 * 	    다시 반복처리한다.
		 * 
		 *    따라서 continue문 밑의 문장들은 스킵이 된다.
		 * 	  => 문법:
		 * 		if(조건)continue;
		 * 		문장n; //skip된다.
		 *      }//반복문 끝으로 간다.
		 * 
		 * 
		 */
		//1 ~ 10까지 반복하자
		// 조건: 3이면 반복을 중단하자.
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println("값:" +i); if(i==3)break; }
		 */
		// 조건: 3이면 반복을 중단하자.
		for (int i = 1; i <= 10; i++) {
			if(i==3)continue;
			System.out.println("값2:" +i);
		}
		System.out.println("End");
	}//end main 	
}
