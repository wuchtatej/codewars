package codewarsPackage;


public class SmashWords {

	public static String smash(String... words) {
		if ( words == null ) return null;
		if ( words.length == 0 ) return "";
		
		String output = "";
		for (String string : words) {
			output += " " + string;
		}
		
		return output.substring(1);
    // TODO Write your code below this comment please
  }
	
	
	public static void main(String[] args) {
		String[] a = {};
		System.out.println( ">" + smash( a ) + "<");
	}
}