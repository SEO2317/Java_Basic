package vehicle;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	public Car() {
		super();
	}
	
	
	public Car(int maxWeight, double oilTankSize, double efficiency, double restOil, int curWeight) {
		super(maxWeight, oilTankSize, efficiency);
		this.restOil = restOil;
		this.curWeight = curWeight;
	}


	public void addOil(int oil) {
		if(curWeight+ restOil > oil){
            System.out.println("오일탱크크기를 " + oil + "넘어서면 안된다 ");
        }else{
        	oil += restOil;
        }
    }
	
	public void moving(int distance) { 
	
	}
	
	public void addWeight(int weight) { 
	
	}

	public double getRestOil() {
		return restOil;
	}


	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}


	public int getCurWeight() {
		return curWeight;
	}


	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
	@Override
	public String toString() {
		return "Car [restOil=" + restOil + ", curWeight=" + curWeight + "]";
	}

}
