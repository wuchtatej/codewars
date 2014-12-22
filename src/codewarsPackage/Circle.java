/**
 * 
 */
package codewarsPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author SG0213936
 *
 */
public class Circle
{
  public static double area(double radius) {
    if( radius <= 0) throw new IllegalArgumentException();
    double result = Math.pow( radius, 2.0 ) * Math.PI;  
    return round(result, 2); 
  }

  public static double round( double value, int places ){
    if(places < 0) throw new IllegalArgumentException();

    BigDecimal bd = new BigDecimal( value );
    bd.setScale( places, RoundingMode.HALF_UP );

    return bd.doubleValue();

  }
}
