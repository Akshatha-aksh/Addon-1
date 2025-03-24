package session4;

public class Stringbufferandbuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		//insert
		sb.insert(5, ",");
		System.out.println("After insert: "+sb);
		
		//replace
		sb.replace(6, 11,"java");
		System.out.println("After replace: "+sb);
		
		//reverse
		sb.reverse();
		System.out.println("After reverse: "+sb);
		
		//append
		sb.append("world");
		System.out.println("After append: "+sb);
	}

}
