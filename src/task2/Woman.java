package task2;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Person {

	
	
	Woman(String Isname, String Iname, float Iweight, float Iheight) {
		super(Isname, Iname, Iweight, Iheight, false);
		
	}

	public Person giveBirth(Person p){
		
		Scanner sc = new Scanner(System.in);
		String name;
		Person baby;
		Random r= new Random();
		if(r.nextInt()%2==0)
		{
			System.out.println("You've got a baby!\nInsert girl's name:");
			
			name = sc.nextLine();
			float height=this.getHeight()+(this.getHeight()-p.getHeight())/10;
			float weight=this.getWeight()+(this.getWeight()-p.getWeight())/10;
			baby = new Woman(p.getSname(),name,height,weight);
		}
		else{
			System.out.println("You've got a baby!\nInsert boy's name:");
			float height=p.getHeight()+(p.getHeight()-this.getHeight())/10;
			float weight=p.getWeight()+(p.getWeight()-this.getWeight())/10;
			name = sc.nextLine();
			baby = new Man(p.getSname(),name,weight,height);
		}
		
		System.out.println(baby);
		return baby; 
	}
	
}
