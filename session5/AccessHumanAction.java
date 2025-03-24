package session5;

public class AccessHumanAction extends Humans implements Senseable{

	@Override
	public void Sense() {
		System.out.println("human traits.....");
		
	}
	public static void main(String[] args) {
		AccessHumanAction aha = new AccessHumanAction();
		aha.Sense();
		aha.Sense();
	}
	
	

}
