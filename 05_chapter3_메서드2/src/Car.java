//자동차 관리 프로그램을 위한 분석단계에서 추출한 car객체(속성,동작)
//설계단계에서는 car 클래스 작성(인스턴스변수,메서드) 작성함.
public class Car {
	//인스턴스 변수
	private String name;
	private int price;
	private String color;
	
	//특별한 경우가 아니면 인스턴스 변수는 private 지정한다.
	//이유는 외부에서 직접 접근하지 못하도록 하기 위해서
	//우회(생성자,메서드)에서 접근한다.
	
	//생성자
	public Car() {}
	
	public Car(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	//메서드
	
	
}
