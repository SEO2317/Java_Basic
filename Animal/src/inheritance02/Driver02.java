package inheritance02;

public class Driver02 {
	public static void main(String[] args) {
		Animal animal =  new Animal();
		Family_Animal family_animal =  new Family_Animal();
		Bird bird = new Bird();
		Whale whale = new Whale();
		Bat bat =  new Bat();
		Small_Bird small_bird = new Small_Bird();
		Penguin penguin = new Penguin();
		
		
		animal.showMe();
		family_animal.showMe();
		bird.showMe();
		whale.showMe();
		bat.showMe();
		small_bird.showMe();
		penguin.showMe();
	}
}
