package task1;

public class Desktop extends Computer {
	
	private boolean displayComplected;
	private boolean keyboardComplected;
	
	
	
	Desktop( String name ,int price, boolean cd,boolean displayComplected, boolean keyboardComplected){
		super(name ,price, cd);
		this.displayComplected=displayComplected;
		this.keyboardComplected=keyboardComplected;
		
	}
	
	Desktop(){}
	
	
	
	
	public boolean isDisplayComplected() {
		return displayComplected;
	}
	public void setDisplayComplected(boolean displayComplected) {
		this.displayComplected = displayComplected;
	}
	public boolean isKeyboardComplected() {
		return keyboardComplected;
	}
	public void setKeyboardComplected(boolean keyboardComplected) {
		this.keyboardComplected = keyboardComplected;
	}


	public String toString(){
		
		
		return "Name:"+name+";\n"+"Price:"+price+";\n"+"Display:"+displayComplected+";\n"+"Keyboard:"+keyboardComplected+";\n";
	}


	
}
