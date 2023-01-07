
public class CastingTest1 {

	public static void main(String[] args) {
		//	기본형 묵시적 형변환
		
		//1. byte > short > int > long > float > double 
		
		byte b=1;	     //그릇 = 값
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		
		float b5 = b4;
		double b6 = b5;
		
		// 역 실습
		int x = 10;
		short x2 = (short)x;  //큰거에서 작은거 저장이 불가하다
		
		//2. char -> int 문자가 수치로 형변환, 연산가능  short로는 변화가 안된다
		char c = 'A';
		int c2 = c;
		System.out.println(c2); //대문자 A 65(아스키코드값) 
		
		char k = 'a'; //
		int k2 = k;
		System.out.println(k2); //소문자 a 97(아스키코드값)
		
		
		//char가 연산이 가능하다.
		System.out.println('A'+1);
		
		//역실습 int --> char
//		char xyz = 'A'; 
//		System.out.println(xyz);
		
		//명시적으로 
		char xyz = 65;
		char xyz2 = (char)65;
		System.out.println(xyz+ " " + xyz);
	}

}
