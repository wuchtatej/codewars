/**
 * 
 */
package codewarsPackage;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author SG0213936
 *
 */
public class PaginationHelperTest
{
 @Test
 public void test1(){
   PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
   // pageIndex takes an item index and returns the page that it belongs on
   assertEquals( ">> 1 >>",  1, helper.pageIndex(5)); //should == 1 (zero based index)
   assertEquals( ">> 2 >>",  0, helper.pageIndex(2) ); //should == 0
   assertEquals( ">> 3 >>", -1, helper.pageIndex(20) ); //should == -1
   assertEquals( ">> 4 >>", -1, helper.pageIndex(-10) ); //should == -1
 }
 @Test
 public void test11(){
   PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
   
   assertEquals( ">> 1 >>",  2, helper.pageCount() );
   assertEquals( ">> 2 >>",  6, helper.itemCount() ); //should == 6
   assertEquals( ">> 3 >>",  4, helper.pageItemCount(0) ); //should == 4
   assertEquals( ">> 4 >>",  2, helper.pageItemCount(1) ); // last page - should == 2
   assertEquals( ">> 5 >>", -1, helper.pageItemCount(2) ); // should == -1 since the page is invalid

 }

 
 
 
 @Test
 public void test2(){
   PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 4);
   // pageIndex takes an item index and returns the page that it belongs on
   assertEquals( ">> 1 >>",  1, helper.pageIndex(5) );
   assertEquals( ">> 2 >>",  0, helper.pageIndex(2) ); 
   assertEquals( ">> 3 >>",  1, helper.pageIndex(7) ); 
   assertEquals( ">> 4 >>", -1, helper.pageIndex(8) ); 
   assertEquals( ">> 5 >>",  0, helper.pageIndex(0) ); 
   assertEquals( ">> 6 >>", -1, helper.pageIndex(9) ); 
   assertEquals( ">> 7 >>", -1, helper.pageIndex(20) ); 
   assertEquals( ">> 8 >>", -1, helper.pageIndex(-10) ); 
 }
 @Test
 public void test22(){
   PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'), 4);
   
   assertEquals( ">> 1 >>",  2, helper.pageCount() );
   assertEquals( ">> 2 >>",  8, helper.itemCount() ); //should == 6
   assertEquals( ">> 3 >>",  4, helper.pageItemCount(0) ); //should == 4
   assertEquals( ">> 4 >>",  4, helper.pageItemCount(1) ); // last page - should == 2
   assertEquals( ">> 5 >>", -1, helper.pageItemCount(2) ); // should == -1 since the page is invalid

 }
 
 
 @Test
 public void test3(){
   PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c'), 1);
   // pageIndex takes an item index and returns the page that it belongs on
   assertEquals( ">> 1 >>",  0, helper.pageIndex(0) ); //should == 1 (zero based index)
   assertEquals( ">> 2 >>",  1, helper.pageIndex(1) ); //should == 0
   assertEquals( ">> 3 >>",  2, helper.pageIndex(2) ); //should == -1
   assertEquals( ">> 4 >>", -1, helper.pageIndex(3) ); //should == -1
 }
 @Test
 public void test33(){
   PaginationHelper<Character> helper = new PaginationHelper<Character>(Arrays.asList('a', 'b', 'c'), 1);
   
   assertEquals( ">> 1 >>",  3, helper.pageCount() );
   assertEquals( ">> 2 >>",  3, helper.itemCount() ); //should == 6
   assertEquals( ">> 3 >>",  1, helper.pageItemCount(0) ); //should == 4
   assertEquals( ">> 4 >>",  1, helper.pageItemCount(1) ); // last page - should == 2
   assertEquals( ">> 5 >>",  1, helper.pageItemCount(2) ); // should == -1 since the page is invalid
   assertEquals( ">> 6 >>", -1, helper.pageItemCount(3) ); // should == -1 since the page is invalid
 }

 

}
