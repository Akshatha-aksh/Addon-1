package session5;

public class AbstractEmployee1 extends AbstractEmployee{
	public void futureDesignation() {
		System.out.println();
	}
	public static void main(String[] args) {
		AbstractEmployee ae = new AbstractEmployee();
		ae.name();
		ae.designation();
		ae.futureDesignation();
	}
	

}
