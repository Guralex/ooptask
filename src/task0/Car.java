package task0;

public class Car {

	private int id;
	private String manufacturer;
	private String model;
	private double price;
	private int year;
	private String color;
	private String number;
	
	Car(int id, String manufacturer,String model,double price,int year,String color,String number){
		
		this.id=id;
		this.manufacturer=manufacturer;
		this.model= model;
		this.price= price;
		this.year=year;
		this.color=color;
		this.number=number;
	}

	public int getId() {
		return id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	public String getNumber() {
		return number;
	}
	
	
	public String toString(){
		
		return "CAR#"+id+"\nManufacturer:"+manufacturer+"\nModel:"+model+"\nYear:"+year+"\nPrice:"+price;
	}
}
