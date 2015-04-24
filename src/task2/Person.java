package task2;

import java.util.Random;

	

public abstract class Person {
	
	private String sname;
	private String name;
	private float weight;
	private float height;
	private boolean sex;
	
	
	Person(String Isname, String Iname, float Iweight, float Iheight, boolean Isex){
		
		sname=Isname;
		name=Iname;
		weight=Iweight;
		height=Iheight;
		sex=Isex;
		
	}
	
	
	
	
	
	public boolean talk(Person obj){
		if(this.sex==false) return true;
		if(obj.sex==false) return true;
		Random r = new Random();
		return (r.nextInt()%2==1);
	}
	public boolean tolerate(Person obj){
		Random r = new Random();
		
		if(this.sex==false && obj.sex==false) return (r.nextInt(100)<5);
		if((this.sex==false && obj.sex==true) ||( this.sex==true && obj.sex==false)) return (r.nextInt(10)<7);
		if(this.sex==true && obj.sex==true) return  (r.nextInt(1000)<56);
		
		return false;
				
	}
	public boolean spendTime(Person obj){
		Random r = new Random();
		if((this.height/obj.height)>0.9 ||(this.height/obj.height)<1.1) return (r.nextInt(100)<95);
		
		
		return (r.nextInt(100)<85);
	}
	public Person date(Person obj){
		if(talk(obj)&&tolerate(obj)&&spendTime(obj)){
			if(obj.sex==this.sex) return null; 
			if(obj.sex==false) obj.giveBirth();
		};
		return null;
	}

}
