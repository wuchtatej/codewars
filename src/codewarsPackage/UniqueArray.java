package codewarsPackage;

import java.util.*;


public class UniqueArray {
	public static int[] unique(int[] integers) {
		
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		for (int i = 0; i < integers.length; i++) {
			tempList.add( integers[i] );
		}


for (Integer integera : tempList) {
	System.out.println(integera);
}
	

		return integers;


	}
	public static void main(String[] args) {
		
	int [] e = {2,3,4,5};
		System.out.println( unique( e ) );
	}
}