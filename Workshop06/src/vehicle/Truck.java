package vehicle;

public class Truck extends Car {

	public Truck() {
		super();
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency, double restOil, int curWeight) {
		super(maxWeight, oilTankSize, efficiency, restOil, curWeight);
		
	}
	
	public double getEfficiency() {
		return getEfficiency();
	}
	public void moving(int distance) {
		
	}
	
	private double calcOil(int distance) {
		return distance;
	}
	
	public int getCost(int distance) {
		return 0;
	}

	@Override
	public String toString() {
		return "Truck []";
	}
}
