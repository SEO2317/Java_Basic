package inheritance02;

public class Bat extends Family_Animal implements  Flyer{
	Bat() {
		myClass = "박쥐";
	}

	@Override
	public void fly() {
		System.out.println(myClass + "날수 있엉 슈우웅!! 슈웅!");
		
	}
}
