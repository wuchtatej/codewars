package codewarsPackage;
import java.util.*;

public class UniqueArray {

  public static int[] unique( int[] integers ) {

    ArrayList<Integer> e = new ArrayList<Integer>();

    for (int i : integers) {
      if( !e.contains( i ) ) e.add( i );
    }

    int[] output = new int[ e.size() ];

    for (int i=0; i<e.size(); i++) {
      output[ i ] = e.get( i );
    }

    return output;

  }

  public static void main( String[] args ) {

    int[] duplicatesInOrder2 = new int[]{1, 2, 3, 3, 2, 1, 2, 3, 1, 1, 3, 2};
    
    
    
    
    System.out.println( unique(duplicatesInOrder2) );
  }
}