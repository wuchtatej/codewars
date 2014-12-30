/**
 * 
 */
package codewarsPackage;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author SG0213936
 *
 */
public class GaryMoveOut
{
  private static String localDirectory = "c:\\KW\\temp";
  private static String targetDirectory = "c:\\KW\\tempo";

  public static void main( String[] args ) throws Exception {

    //moveAlbumsToArtistFolder( localDirectory, targetDirectory );
    //checkArtistFolders( "fanart", targetDirectory );
    //checkArtistFolders( "thumbnail", targetDirectory );
    //checkAlbums( "cover", targetDirectory );
   

  }


  private static void moveAlbumsToArtistFolder(String localDirectory , String targetDirectory ) throws Exception {
    File baseFolder = new File( localDirectory .trim() );

    if ( !baseFolder.exists() ) {
      throw new Exception( "Request dir doesn't exist: " + baseFolder );
    }

    File[] files = baseFolder.listFiles();
    for (File file : files) {
      if( file.isDirectory() ){
        String name = file.getName().split( " - " )[0];

        System.out.println( "processing: " + name);

        Path source = Paths.get( file.getAbsolutePath() );
        Path target = Paths.get( targetDirectory + "\\" + name );

        if( !target.toFile().exists() ){
          target.toFile().mkdir();
        }

        try {
          Files.move(
                     source,
                     target.resolve(source.getFileName()),  
                     StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }
  }

  private static boolean hasAlbumCover() {
    return false;    
  }

  private static void checkArtistFolders( String item, String baseDir ) throws Exception {
  
    File baseFolder = new File( baseDir.trim() );

    if ( !baseFolder.exists() ) {
      throw new Exception( "Request dir doesn't exist: " + baseFolder );
    }

    File[] listOfArtists = baseFolder.listFiles();
    for (File artistDir : listOfArtists) {
      
      File[] listOfFanarts = artistDir.listFiles(new FileFilter() {
        public boolean accept( File pathname ) {

          return pathname.toString().toLowerCase().endsWith( "\\" + item + ".jpg" );
        }
      });
      
      if( listOfFanarts == null || listOfFanarts.length < 1 )
        System.out.println( "Missing artist's " + item + ":   [ " + artistDir.getName()  + " ]\t\t"  + artistDir.getAbsolutePath() );
      else if ( listOfFanarts.length > 1 )
        System.out.println( " ### Multiple artist's " + item + ":   [ " + artistDir.getName()  + " ]\t\t"  + artistDir.getAbsolutePath() );
    }
   
  }

  private static boolean hasArtistFanart( String path ) {
    return false;
  }



}
