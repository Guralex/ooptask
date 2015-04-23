
public class Airliners extends Plane {
	
	Airliners(int passenger, int fuel, int range, String name){
		
		
		passengerLimit = passenger;
		fuelConsumption = fuel;
		flightRange = range;
		weightLimit = 0;
		this.name = name;
	}

}
