package programs;

public class varaibles {
	int a = 25;
	static int b = 50;
	
	public static int print() {
		int mark = 94;
		return mark;
	}
	
	void display() {
		int d = 60;
		System.out.println("method inside varaible:"+d);
	}
	
	public static void main(String[] args) {
		int c =75;
		
		 varaibles obj1 = new varaibles();
		 System.out.println(obj1.a);
		 obj1.display();
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(print());
		 
		 varaible2.show();
		 
		 varaible2 v2 = new varaible2();
		 v2.students();
	}

}
