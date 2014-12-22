package codewarsPackage;

import java.util.Arrays;

public class DRoot {
  
  public static int digital_root( int n ) {

    while( n > 9 ){
      int sum = 0;
      System.out.println( "n: "  + n );
      for (char element : String.valueOf( n ).toCharArray()) {
        sum += Integer.parseInt( String.valueOf( element )) ;
      }
      n = sum;
    }
    return n;

  }
  
  public static int digital_root2(int n) {
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
  }
  
  public static void main( String[] args ) {
    System.out.println( digital_root( 956 ) );
    System.out.println( digital_root2( 956 ) );
  }
}