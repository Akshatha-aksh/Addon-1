package session4;

public class ConstructorOverloading{
	
	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloading(String empname, int empid, String location) {
	this.empname = empname;
	this.empid = empid;
	this.location = location;
}
	
	public void displayInfo() {
		System.out.println("Empname: "+this.empname);
		System.out.println("EmpId: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}
	

	public static void main(String[] args) {
		ConstructorOverloading cox = new ConstructorOverloading("jenni", "2322kb03", "cbe");
		ConstructorOverloading cox1 = new ConstructorOverloading("Moses sir","0","");
		ConstructorOverloading cox2 = new ConstructorOverloading("arvind","0","");
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
		
		
		
	}

}
