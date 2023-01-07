package inheritance02;

public class Small_Bird extends Bird implements Flyer{
	Small_Bird() {
		myClass = "참새";
	}

	@Override
	public void fly() {
		System.out.println(myClass + "날수 있엉 어 어후적!! 어어어어 어후적!");
		
	}
}
