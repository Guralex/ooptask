package task0;

import java.util.Arrays;

import task1.Computer;

	
	


public class Carshop {

	
	private String name;
	private Car[] cars;
	

	 Carshop(String Iname){
		
		name=Iname;
		this.cars = new Car[0];
	}
	 
	 
	 public void addCar(String manufacturer,String model,double price,int year,String color,String number){
			
			Car[] newcars=Arrays.copyOf(cars, cars.length+1);
			Car car = new Car(cars.length,manufacturer,model,price,year,color,number);
			newcars[cars.length]=car;
			cars=newcars;
		}

	 public void showByManufacturer(String man){
		 
		 System.out.println("Cars made by: "+man);
		 for(Car car:cars)if(car.getManufacturer().equals(man)) System.out.println(car);
	 }

	 public void showByYearAndPrice(int y, double p){
		
		 System.out.println("Cars made in: "+y+"\nPrice>"+p);
		 for(Car car:cars)if(car.getYear()==y && car.getPrice()>=p) System.out.println(car);
		 
	 }
	 
	 public void showByNameAndAge(String model, int y){
			
		 System.out.println("Cars of model: "+model+"\nAge>"+y);
		 for(Car car:cars)if(car.getYear()>(2015-y) && car.getModel().equals(model)) System.out.println(car);
		 
	 }

	 public String toString(){
			
			String res="";
			
			for(Car car:cars) res+= car.toString();
			
			return name+"Cars:\n"+res+"__________________";
		}
}
