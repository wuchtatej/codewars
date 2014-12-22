package codewarsPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AnagramCheckerTest {
	private String first;
	private String second;
	private Boolean expectedResult;

	public AnagramCheckerTest(String first, String second, Boolean expectedResult) {
		this.first = first;
		this.second = second;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "elvis", "lives", true } });
	}

	@Test
	public void testIsAnagram() {
		assertEquals(expectedResult, AnagramChecker.isAnagram(first, second));
	}

}