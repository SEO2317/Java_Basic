
public class CastingTest2 {
	public static void main(String[] args) {
		//3. int 보다 작은 타입의 연산결과는 int로 반환된다.
		short s = 10;
		short s2 = 5;
//		short s3 = (short) ((short)s + (short)s2); //방법2
		short s3 = (short) (s+s2); //방법1

		//4. 연산할 때 작은 타입하고 큰 타입이면 결과는 큰 타입이 변환된다.
		int y = 10;
		double y2 = 3.14;
		double result = y + y2;
		
		/*
		 *  기본형 및 참조형도 데이터 형변환이 가능하다.
		 *  즉, 참조형인 클래스 형변환이 가능하다.
		 *  예> A 클래스  --> B 클래스 타입으로 변환하다		 
		 *   단, A와 B의 관계가 상속관계여야 한다.
		 *    역으로 변환되는 클래스들간의 관계가 상속관계가 아니면
		 *    형변환이 안된다.
		 *  */
		
		
	}
}
