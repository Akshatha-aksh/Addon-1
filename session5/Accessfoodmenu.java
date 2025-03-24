package session5;

public class Accessfoodmenu implements Vegitems, Nonvegitems {

	@Override
	public void fry() {
		System.out.println("Fish fry");
		
	}

	@Override
	public void gravy() {
		System.out.println("Chicken gravy, Mutton gravy");
		
	}

	@Override
	public void breakfast() {
		System.out.println("Idly, Dosa, Pongal etc..");
		
	}

	@Override
	public void lunch() {
		System.out.println("Curd rice, Meals, Biriyani");
		
	}

}
