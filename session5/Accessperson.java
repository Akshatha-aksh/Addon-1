package session5;

public class Accessperson {
	public static void main(String[] args) {
		//original person object
		Person originalPerson = new Person("Aksha",19);
		
		//copied person object
		Person copiedPerson = new Person(originalPerson); //Object dependency
		
		System.out.println("Original Person:");
		originalPerson.displayInfo();
		
		System.out.println("Copied Person:");
		copiedPerson.displayInfo();
	}

}
