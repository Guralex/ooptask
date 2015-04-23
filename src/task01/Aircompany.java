package task01;

import java.util.ArrayList;
import java.util.Comparator;



public class Aircompany  /*implements Comparable<Plane>*/{

	private String name;
	private ArrayList<Plane> planes;
	
	
	Aircompany(String Iname){
		
		name=Iname;
		this.planes = new ArrayList();
	}
	Aircompany(String Iname, Plane[] planes){
		
		name=Iname;
		this.planes = new ArrayList();
		for(Plane plane:planes) this.planes.add(plane);
		
	}
	
	public void addPlane(Plane plane){
		planes.add(plane);
	}

	public Plane getPlane(int i){
		return planes.get(i);
	}

	public Plane getPlane(String str){
		
		for(Plane plane:planes)
			if(plane.getName().equals(str)) return plane;
		
		return null;
		
	}

	public void showByFuel(int min, int max){
		
		System.out.println("------");
		System.out.print("Planes with FC between "+min+" and "+max+":");
		
		for(Plane plane:planes)if(plane.getFuelConsumption()>=min && plane.getFuelConsumption()<=max) System.out.print(plane.getName()+" ");
		
	}


	public String toString(){
		
		String res="";
		
		for(Plane plane:planes) res+= plane.getName();
		
		return name+"\n" + "Planes: "+res;
	}
	
}
