/**
 * 
 */
package codewarsPackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Anagrams {

  public static void main( String[] args ) {
   System.out.println( listPosition( "IMMUNOELECTROPHORETICALLY" ) ) ;
    
    ArrayList<Character> abc = new ArrayList<Character>();
    String string ="BOOKKEEPER";
    for (Character character : string.toCharArray()) {
      abc.add( character );
    }
    Collections.sort( abc );
    System.out.println(getNrOfPerms(abc)) ;
 
  }
  
  
  public static BigInteger listPosition( String input ){
    
    if( input.length() == 0 ) return BigInteger.ONE;

    ArrayList<Character> al = new ArrayList<Character>();
    for (Character character : input.toCharArray()) {
      al.add( character );
    }
    
    Collections.sort( al );
   
    char tempChar = al.get( 0 );
    BigInteger nrOfPerms = BigInteger.ZERO;
    ArrayList<Character> tempAl = new ArrayList<Character>( al );

    for (int index = 0; index < al.size()-1; index++) {
    
      if( al.get( index ) >= input.charAt( 0 ) ) 
        break;
      if( index == al.size()-1 || tempChar != tempAl.get( index + 1 ).charValue() ){
        tempChar = al.get( index + 1 );
        tempAl.remove( index );
        nrOfPerms = nrOfPerms.add( getNrOfPerms( tempAl ) );
        tempAl.clear();
        tempAl.addAll( al );
      }      
    }
    return nrOfPerms.add( listPosition( input.substring( 1 ) ) );
  }



  private static BigInteger getNrOfPerms( ArrayList<Character> tempAl ) {

    char tempChar = tempAl.get( 0 );
    BigInteger denominator = BigInteger.ONE;
    int nrOfDuplicateLetters = 1;

    int nrOfInputLetters = tempAl.size();

    for (int i = 1; i < nrOfInputLetters; i++) {
      if( tempChar == tempAl.get( i ) ){
        nrOfDuplicateLetters++;
      }
      else{ 
        tempChar = tempAl.get( i );
        denominator = denominator.multiply( factorial( nrOfDuplicateLetters ) );
        nrOfDuplicateLetters = 1;
      }
    }
    denominator = denominator.multiply( factorial( nrOfDuplicateLetters ) );

    BigInteger numerator = factorial( nrOfInputLetters );
    BigInteger nrOfPermutationsWithouthRepetition = numerator.divide( denominator );

    return nrOfPermutationsWithouthRepetition;
  }

  
  
  
  public static BigInteger factorial( long n ){
    if ( n == 1 || n == 0 ) return BigInteger.ONE;
    return BigInteger.valueOf( n ).multiply( factorial( n-1 ) );
  }

}