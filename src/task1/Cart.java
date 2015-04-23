package task1;

import java.util.ArrayList;
import java.util.Collections;






public class Cart {
	
	private String name;
	private ArrayList<Computer> computers;
	
	 Cart(String Iname){
		
		name=Iname;
		this.computers = new ArrayList();
	}
	 Cart(String Iname, Computer[] computers){
		
		name=Iname;
		this.computers = new ArrayList();
		for(Computer computer: computers) this.computers.add(computer);
		
	}
	
	
	
	
	public void addComputer(Computer computer){
		computers.add(computer);
	}

	public Computer getComputer(int i){
		return computers.get(i);
	}
	
	public String toString(){
		
		String res="";
		
		for(Computer computer:computers) res+= computer.getName();
		
		return name+"\n" + "Computers: "+res;
	}

	public void sort(){
		
		Collections.sort(computers);
	}
}
