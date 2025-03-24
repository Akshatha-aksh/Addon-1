package session5;

public class Dog extends Animal{
	
	public void character() {
		System.out.println("Fearless hunters");
	}
	public static void main(String[] args) {
		Dog dg = new Dog();
		dg.character();
		dg.Features();
		
		Cat ct = new Cat();
		ct.sound();
		ct.Features();
		
	}

}
