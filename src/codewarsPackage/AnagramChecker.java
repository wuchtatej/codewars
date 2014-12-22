/**
 * 
 */
package codewarsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class AnagramChecker {
  public static boolean isAnagram(String first, String second) {
    if( first == null || second == null || first.length() != second.length() ) return false;

    ArrayList<Character> al = new ArrayList<Character>();
    for (Character ch : first.toCharArray()) {
      al.add( ch );
    }
   // Collections.sort( first.toCharArray() );

    for (Character character : second.toCharArray()) {
      if( !al.contains( character ) )
        return false;
    }

    return true;
    //TODO: check for anagrams
  }
  
  public static boolean isAnagram2(String first, String second) {
    char[] firstArray = first.toCharArray();
    char[] secondArray = second.toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    return Arrays.equals(firstArray, secondArray);
  }
  
  public static void main( String[] args ) {
    //In this kata, please write a method which will check if the provided two strings are anagrams. If any argument is null, return false. As input all unicode characters starting from \u0000 to \uFFFF
  }
}