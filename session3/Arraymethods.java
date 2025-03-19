package session3;

import java.util.Arrays;

public class Arraymethods {
	public static void main(String[] args) {
		
		//Lenght of an array
		int[] num = {10,20,30,40,50};
		System.out.println("Length of num:"+num.length);
		
		//Copying an array
		int[] source = {1,2,3,4,5};
		int[] destination = new int[5];
		
		//copy array
		System.arraycopy(source, 0, destination, 0, source.length);
		
		for(int i : destination) {
			System.out.println(i+" ");
		}
	} 
	
	
	
	

	
	


}
