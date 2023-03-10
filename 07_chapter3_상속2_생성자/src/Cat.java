
public class Cat extends Pet{
	public Cat() {
		//모든 클래스 자식생성자 첫라인에서 부모 생성자를 
		//호출하는 코드가 자동으로 삽입된다. ==> super();
		/*
		 * 따라서 Pet 생성하는 코드가 자동으로 삽입됨 
		 * 그렇다고 new Pet()은 아니다.
		 * new Pet() 방식은 다른 클래스에서 사용하고
		 * 자식에서는 super() 형식으로
		 * 부모 생성자를 호출하기 위해서
		 * 자동으로 삽입된다.
		 * 
		 * 
		 */
		super();//부모의 기본생성자 호출 코드
		System.out.println("Cat 생성자");
		
		/*
		 * // super();//부모의 기본생성자 호출 코드 
		 * // System.out.println("Cat 생성자");		 
		 *
		 * 자식생성자 첫 라인에서 super()지정해야 된다.
		 * 부모의 오버로딩 생성자 호출도 가능하다
		 * 예> super();
		 * 	   super(값1,값2,....)
		 *
		 */	
		}
}
