package session5;

public class Child extends Parent {
	public void assets(){
		System.out.println("Parents assests and properties with child assests");
	}
	
	public void vehicle() {
		System.out.println("Car");
	}
	
	public static void main(String[] args) {
		Child cd = new Child();
		cd.assets();
		cd.vehicle();
	}

}
