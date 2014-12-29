package codewarsPackage;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

  List<I> localCollection;
  int itemsPerPage;
  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.localCollection = collection;
    this.itemsPerPage = itemsPerPage;
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return localCollection.size();  
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
    return (int) Math.round( (double)localCollection.size()/itemsPerPage );
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    if ( pageIndex*itemsPerPage >= localCollection.size() || pageIndex<0 ) return -1;
    return pageIndex == localCollection.size()/itemsPerPage ? localCollection.size()%itemsPerPage : itemsPerPage;
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if ( itemIndex > localCollection.size()-1 || itemIndex<0 ) return -1;
    return itemIndex/itemsPerPage;
  }
  
  
  public static void main( String[] args ) {
  System.out.println( Math.round( (double)1/4 ) );
  }
  
  
}