package task01;

public class Main {

	public static void main(String[] args) {

		Airliners boeing = new Airliners(300,15,1000,"Boeing 747");
		Airliners antonov = new Airliners(100,7,700,"AN 41");
		Freighters mria = new Freighters(100,5,700,"AN MRIA");
		
		Plane[] planes = {antonov,mria};
		
		Aircompany air = new Aircompany("AirlineOne",planes);
		
		System.out.println(air);
		
		
		
		air.showByFuel(6, 20);
		
	}

}
