package inheritance02;

public class Whale extends Family_Animal implements Swimer{
	Whale() {
		myClass = "포유류";
	}

	@Override
	public void swim() {
		System.out.println(myClass + " 수영 중 . 어프!!! 어프!");
		
	}
}