package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Relations {

	
	public void start(){
		
		personInit().date(personInit());
	}
	
	public Person personInit(){
		
		Person pers;
		boolean gender=false;
		String name;
		String sname;
		float height;
		float weight;
		
		System.out.println("Gender (m/f)");
		Scanner sc = new Scanner(System.in);
		String com;
		com = sc.nextLine();
	
		switch (com) {
		case "m":
			gender=true;
			break;
		case "f":
			gender=false;
			break;

		default: System.out.println("Incorrect command");
		System.exit(0);
			break;
		}
		
		System.out.println("Name:");
		name = sc.nextLine();
		System.out.println("Surname:");
		sname = sc.nextLine();
		System.out.println("Height:");
		height = Float.parseFloat((sc.nextLine()));
		System.out.println("Weight:");
		weight = Float.parseFloat(sc.nextLine());
		
		if(gender) {pers=new Man(sname,name,height,weight);}
		else{pers=new Woman(sname,name,height,weight);}
		return pers;
		}
	
}
