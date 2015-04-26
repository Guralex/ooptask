package task0;

public class Main {

	public static void main(String[] args) {
		
		
		Carshop vasya = new Carshop("Vasya shop");
		
		vasya.addCar("Renault", "Megan",199.90, 2011, "blue", "xx999xx");


		vasya.addCar("BMW", "X6",1999.90, 2011, "blue", "xx999xx");
		vasya.addCar("Renault", "Megan",109.90, 2005, "blue", "xx999xx");
		
		//vasya.showByManufacturer("Renault");
	//	vasya.showByNameAndAge("Megan", 8);
		vasya.showByYearAndPrice(2011, 1000);
	}

}
