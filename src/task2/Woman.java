package task2;

import java.util.Random;

public class Woman extends Person {

	
	
	Woman(String Isname, String Iname, float Iweight, float Iheight) {
		super(Isname, Iname, Iweight, Iheight, false);
		
	}

	public Person giveBirth(Person p, String name){
		
		Person baby;
		Random r= new Random();
		if(r.nextInt()%2==0)
		{
			baby = new Woman(p.getSname(),name,this.getHeight(), this.getWeight());
		}
		else{
			
			baby = new Man(p.getSname(),name,this.getHeight(), this.getWeight());
		}
		
		System.out.println(baby);
		return baby; 
	}
	
}
