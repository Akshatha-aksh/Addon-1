package session4;

public class Constructor {
	
	public int sum(int a, int b) {
		int res = a + b;
		return res;
	}
	
	public static void main(String[] args) {
		Constructor ce = new Constructor();
		System.out.println(ce.sum(5, 10));
		
	}

}
