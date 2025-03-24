package session5;

public class Wrapperclass {
	public static void main(String[] args) {
		
		//Converting Primitive to Wrapperclass
		int a = Integer.valueOf(50);
		
		Integer intObj = 50; // Equivalent to Integer.valueof(50)
		
		Character charObj = 'A';
		
		Double dObj = 25.35478;
		
		System.out.println(a);
		System.out.println(intObj);
		System.out.println(charObj);
		System.out.println(dObj);
		
		//Using Utility method from Wrapper class
		int parseInt = Integer.parseInt("123");
		double parseDouble = Double.parseDouble("25.364782");
		boolean parseBoolean = Boolean.parseBoolean("true");
		
		System.out.println(parseInt);
		System.out.println(parseDouble);
		System.out.println(parseBoolean);
		
	}

}
