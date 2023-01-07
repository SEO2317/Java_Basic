package inheritance02;

public class Driver {
	public static void main(String[] args) {
		Flyer flyer1 =  new Bat();
		flyer1.fly();
		
		Flyer flyer2 =  new Small_Bird();
		flyer2.fly();
		
		Swimer[] beers =  new Swimer[2];
	
		
		beers[0] = new Whale();
		beers[1] = new Penguin();
		
		for(Swimer beer : beers) {
			beer.swim();
		}
	}
}
