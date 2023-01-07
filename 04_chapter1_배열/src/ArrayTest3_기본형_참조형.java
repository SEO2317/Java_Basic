import java.util.Arrays;

public class ArrayTest3_기본형_참조형 {
	//메서드
	public static void int_change(int x) {
		System.out.println(x);
		x = 20;
	}
	
	public static void intArr_change(int [] xxx) {
		xxx[0]=100;
	}

	public static void main(String[] args) {
	
		int num = 10;
		//기본형 데이터는 메서드 호출해서 전달시 값(실제값)이 전달된다. ==> 복사형태로 사용됨
		//따라서 넘겨 받은 곳에서 임의의로 데이터를 변경해도 원본은 영향을 받지 않는다.
		System.out.println("호출전:" +num);
		
		int_change(num); //10을 가지고 in_change메소드 변수를 갖고 간다.
		System.out.println("호출후:" +num);
		
		
		//호출전 10
		//기본형 데이터는 메서드를 이용해서 값을 이 복사 넘겨 받아
		//영향이 없다.
		
		
		//참조형
		//참조형 데이터는 메서드 호출해서 전달 시 값(주소값)이 전달된다. ==> 원본과 같은 주소를 갖게 된다.
		//따라서 넘겨 받은 곳에서 임의로 데이터를 변경하면 원본값이 영향을 받는다.
		int [] k = {1,2,3}; //int 배열 타입
		System.out.println("호출전:"+ Arrays.toString(k));
		intArr_change(k); //0x100
		System.out.println("호출후:"+ Arrays.toString(k));
		
	
	}

}
	