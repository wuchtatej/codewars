package codewarsPackage;

import java.util.stream.Collectors;

public class SquareDigit {

  public static int squareDigits(int n) {
    
    StringBuilder sb = new StringBuilder();
   
    for (char c : String.valueOf(n).toCharArray()) {
      int digit = Integer.parseInt(String.valueOf(c));
      sb.append( (int) Math.pow( digit, 2.0 ) );
    }

    return Integer.parseInt( sb.toString() );

  }
  
 
  public static void main( String[] args ) {
    
    long startTime, endTime;
     
    startTime = System.nanoTime();
    squareDigits(18536);
    endTime = System.nanoTime();
    System.out.println("method : " + (endTime - startTime) + "\n=============");
    
    startTime = System.nanoTime();
    squareDigits(18536);
    endTime = System.nanoTime();
    System.out.println("method : " + (endTime - startTime));
    
  }
}