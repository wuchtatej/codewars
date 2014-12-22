/**
 * 
 */
package codewarsPackage;


import java.util.Arrays;
import java.util.Comparator;


public class GiftSorter{
  public static String sortGiftCode(String code){
    
    char[] lista =  code.toCharArray();     
    Arrays.sort(lista);
    
    StringBuilder sb = new StringBuilder(lista.length);
    for (char c : lista) sb.append(c);
    
    return sb.toString();
   
  }
  public static String sortGiftCode2(String code){
    
 // put the characters into an array
    Character[] chars = new Character[code.length()];
    for (int i = 0; i < chars.length; i++)
        chars[i] = code.charAt(i);

    // sort the array
    Arrays.sort(chars, new Comparator<Character>() {
        public int compare(Character c1, Character c2) {
            int cmp = Character.compare(
                Character.toLowerCase(c1.charValue()),
                Character.toLowerCase(c2.charValue())
            );
            if (cmp != 0) return cmp;
            return Character.compare(c1.charValue(), c2.charValue());
        }
    });

    // rebuild the string
    StringBuilder sb = new StringBuilder(chars.length);
    for (char c : chars) sb.append(c);
    return sb.toString();
   
  }
  
  
  
  
  public static void main( String[] args ) {
    System.out.println( sortGiftCode( "asdbargq") );
    

    
    long startTime, endTime;
     
    startTime = System.nanoTime();
    sortGiftCode("psiovugneqwl");
    endTime = System.nanoTime();
    System.out.println("method : " + (endTime - startTime) + "\n=============");
    
    startTime = System.nanoTime();
    sortGiftCode("psiovugneqwl");
    endTime = System.nanoTime();
    System.out.println("method : " + (endTime - startTime) );
    
    startTime = System.nanoTime();
    sortGiftCode2("psiovugneqwl");
    endTime = System.nanoTime();
    System.out.println("method : " + (endTime - startTime) );
  }
}