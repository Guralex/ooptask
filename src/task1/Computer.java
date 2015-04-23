package task1;

public abstract class Computer implements Comparable<Computer> {

	protected int price;
	protected String name;
	private boolean cd;
	
	
	Computer( String name ,int price, boolean cd){
		
		this.price=price;
		this.name=name;
		this.cd=cd;
	}
	
	Computer(){}
	
	
	
	public boolean isCd() {
		return cd;
	}
	public void setCd(boolean cd) {
		this.cd = cd;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int compareTo(Computer comp){
		
		if(this.price>comp.price) return 1;
		if(this.price<comp.price) return -1;
		
		return 0;
	}
	
}
