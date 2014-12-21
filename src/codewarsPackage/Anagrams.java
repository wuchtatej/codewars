package codewarsPackage;
import java.math.BigInteger;

public class Anagrams {
	public static BigInteger listPosition(String word) {
		
		String[] a = word.split("");
		
		for (int i = 0; i < a.length; i++) {
			
		}
		return BigInteger.ZERO;
	}


	public static void main(String[] args) {
		System.out.println( listPosition("BAAA") ) ;
		System.out.println( listPosition("AAAB") ) ;
		System.out.println( listPosition("QUESTION") ) ;
		System.out.println( listPosition("BOOKKEEPER") ) ;
	}
}

/*
ac = 2   

length 
abc = 1 
acb = 2
bac
bca
cab
cba

cab => 2



*/