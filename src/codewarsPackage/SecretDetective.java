package codewarsPackage;

import java.util.ArrayList;
import java.util.HashSet;


public class SecretDetective {

	public static  String recoverSecret(char[][] triplets) {

		ArrayList<Character> charList = new ArrayList<Character>();


		for (int i = 0; i < triplets.length; i++) {
			char[] cs = triplets[i];
			int flag = 0;

			for (int j = 0; j < cs.length; j++) {
				char c = cs[j];
				if ( i == 0 ){
					charList.add( c );
				}
				else if ( charList.contains( c ) ){
					int index = charList.indexOf( c );
					while( flag > 0 ){
						charList.add( index--, cs[j-1] );
						flag--;
					}
				}
				else{
					flag++;
				}
			}

		}

		String a = "";

		for (Character character : charList) {
			a += character;
		}
		return a;

	}


	public static  String recoverSecret2(char[][] triplets) {

		HashSet<Character> charSet = new HashSet<Character>();

		for (int i = 0; i < triplets.length; i++) {
			char[] cs = triplets[i];
			for (int j = 0; j < cs.length; j++) {
				charSet.add( cs[j] );
			}
		}

		ArrayList<Character> charList = new ArrayList<Character>(charSet);

		boolean flag;
		do{
			flag = false;
			for (int i = 0; i < triplets.length; i++) {
				char[] cs = triplets[i];
				int previousIndex = 0;

				for (int j = 0; j < cs.length; j++) {
					int localIndex = charList.indexOf( cs[j] );
					if( localIndex < previousIndex ){
						charList.remove( localIndex );
						charList.add( previousIndex, cs[j] );
						flag = true;
					}
					previousIndex = localIndex;
				}
			}
			System.out.println(charList);
		} while (flag);
		

		String a = "";
		for (Character character : charList) {
			a += character;
		}
		return a;

	}
	
	
	
	
	public static void main(String[] args) {

		char[][] triplets = {
				{'t','u','p'},
				{'w','h','i'},
				{'t','s','u'},
				{'a','t','s'},
				{'h','a','p'},
				{'t','i','s'},
				{'w','h','s'}
		};
		System.out.println( recoverSecret2( triplets) );
	}
}