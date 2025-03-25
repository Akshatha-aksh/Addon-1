package session6;

public class Exception {
	String str1 = "123";
	
	public void name() {
		try {
			
			int i = Integer.parseInt(str1);
			System.out.println("The value of converted String:"+str1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	

}
