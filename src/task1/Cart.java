package task1;


import java.util.Arrays;
import java.util.Collections;






public class Cart {
	
	private String name;
	private Computer[] computers;
	
	 Cart(String Iname){
		
		name=Iname;
		this.computers = new Computer[0];
	}
	 Cart(String Iname, Computer[] computers){
		
		name=Iname;
		this.computers = Arrays.copyOf(computers,computers.length);
		
		
	}
	
	
	
	
	public void addComputer(Computer computer){
		
		Computer[] newcomputers=Arrays.copyOf(computers, computers.length+1);
		
		newcomputers[computers.length]=computer;
		computers=newcomputers;
	}

	public Computer getComputer(int i){
		return computers[i];
	}
	
	public String toString(){
		
		String res="";
		
		for(Computer computer:computers) res+= computer.getName();
		
		return name+"\n" + "Computers: "+res;
	}

	/*public void sort(){
		
		Collections.sort(computers);
	}*/
}
