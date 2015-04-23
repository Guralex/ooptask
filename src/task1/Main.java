package task1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		Desktop intel = new Desktop("Intel",100,false,false,false);
		Laptop amd = new Laptop("Intel Mobile",50,true, 2000,16);
		Desktop snapdragon = new Desktop("Snap",200,false,false,false);
		
		Computer[] comps = {intel,amd,snapdragon};
		
		Cart cart1 = new Cart("Shop",comps);
		
		System.out.println(cart1);
		cart1.sort();
		System.out.println(cart1);
	}

}
