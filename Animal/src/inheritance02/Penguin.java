package inheritance02;

public class Penguin extends Bird implements Swimer{
	Penguin() {
		myClass = "펭귄";
	}

	@Override
	public void swim() {
		System.out.println(myClass + "수영 중. 푸우악욱!!!ㄴ 푸우욱!!");
		
	}
}
