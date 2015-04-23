package task1;

public class Laptop extends Computer
{


	private int batteryCapacity;
	private int screenSize;

	Laptop( String name ,int price, boolean cd,int batteryCapacity, int screenSize){
		super(name ,price, cd);
		this.batteryCapacity=batteryCapacity;
		this.screenSize=screenSize;
		
	}
	
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public String toString(){
		
		
		return "Name:"+name+";\n"+"Price:"+price+";\n"+"Battery:"+batteryCapacity+";\n"+"Screen:"+screenSize+";\n";
	}
}
