
public class Constant_상수 {

	public static void main(String[] args) {
		
		//상수 -> final 키워드,  read only만 가능
		//상수인 final 확장되서 enum 타입형식으로 사용된다.
		final int NUM = 100;
		final int NUM_VALUE = 200;
		
		final String KOREA = "대한민국";
		
//		//상수는 값 변경 불가
//		NUM = 200;
		
		
		System.out.println(NUM);
		System.out.println(NUM_VALUE);
		System.out.println(KOREA);
	}

}
