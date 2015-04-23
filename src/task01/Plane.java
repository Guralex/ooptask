package task01;

public abstract class Plane implements Comparable<Plane> {

	
	protected String name;
	protected int weightLimit;
	protected int passengerLimit;
	protected int fuelConsumption;
	protected int flightRange;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public int getWeightLimit() {
		return weightLimit;
	}
	public int getPassengerLimit() {
		return passengerLimit;
	}
	public int getFuelConsumption() {
		return fuelConsumption;
	}
	public int getFlightRange() {
		return flightRange;
	}
	public String getName(){
		return name;
	}
	
	
	public int compareTo(Plane plane){
		if(this.fuelConsumption>plane.fuelConsumption) return 1;
		if(this.fuelConsumption<plane.fuelConsumption) return -1;
		
		return 0;
	}
	
	public String toString(){
		
		
		
		
		return "NAME: "+name+"\n"+"Pass. limit: "+passengerLimit+"\n"+"Weigh limit: "+weightLimit+"\n"+"Range: "+flightRange+"\n"+"Fuel con.: "+fuelConsumption+"\n";
	}
}
