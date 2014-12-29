/**
 * 
 */
package codewarsPackage;

import static org.junit.Assert.*;

import java.util.regex.Matcher;

import org.junit.Test;

/**
 * @author SG0213936
 *
 */
public class Mod4Test {
  @Test
  public void testValidMod4() throws Exception {
    String[] validTests = {"[+05620]", "[005624]", "[-05628]", "[005632]", "[555636]", "[+05640]", "[005600]",
                           "the beginning [-0] the end", "~[4]", "[32]", "the beginning [0] ... [invalid] numb[3]rs ... the end",
                           "...may be [+002016] will be."};
    for(String test : validTests) {
      Matcher m = Mod.mod4.matcher(test);
      assertTrue(test + " is valid, but no match was made.", m.find());
    }
  }
  
  @Test
  public void testInvalidMod4() throws Exception {
    String[] invalidTests = {"[+05621]", "[-55622]", "[005623]", "[~24]", "[8.04]", "No, [2014] isn't a multiple of 4..."};
    for(String test : invalidTests) {
      Matcher m = Mod.mod4.matcher(test);
      assertFalse(test + " is invalid, but a match was made.", m.find());
    }
  }
  
  @Test
  public void testInvalidrandom() throws Exception {
    String invalidTests = "f3ca2046-72f7-4b40-a06f-763d53ae8eca[172.85123835234296]3e3c6333-7199-4bd8-87c2-2e291baed413[~354]";
  
    Matcher m = Mod.mod4.matcher( invalidTests );
    assertFalse(invalidTests + " is invalid, but a match was made.", m.find());

  }
  
}