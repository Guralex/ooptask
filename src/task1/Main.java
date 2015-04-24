package task1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		Desktop intel = new Desktop("Lenovo Thinkpad",100,false,false,false);
		Laptop amd = new Laptop("Asus k54",50,true, 2000,16);
		Desktop snapdragon = new Desktop("Xaomi MI2",200,false,false,false);
		Laptop razer = new Laptop("Razer Blade 19'",3000,true, 2500,19);
		
		Computer[] comps = {intel,amd,snapdragon};
		
		Cart cart1 = new Cart("Shop",comps);
		
		System.out.println(cart1);
		cart1.addComputer(razer);
		System.out.println(cart1);
		cart1.sort();
		System.out.println(cart1.getComputer(3)); 
		
	}

}
