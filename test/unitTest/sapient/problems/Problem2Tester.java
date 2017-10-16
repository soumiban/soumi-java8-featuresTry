package unitTest.sapient.problems;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import test.sapientInterview.svc.Problem2Svc;

public class Problem2Tester {

	Problem2Svc svc2;
	String exmpleStrForPositiveTest;
	String exampleStringForNegetiveTest;

	@Before
	public void initiateDataForQ1() {
		// Problem1Tester tester = new Problem1Tester();
		svc2 = new Problem2Svc();
		exmpleStrForPositiveTest = "The quick brown fox jumps over a lazy dog.";
		exampleStringForNegetiveTest = "The quick rown fox jumps over a lazy dog.";
	}

	@Test
	public void testPangramTrue() {
		Set<Character> list = svc2.findMissingLetters(exmpleStrForPositiveTest);
		assertEquals(0, list.size());
	}

	@Test
	public void testPangramFalse() {
		Set<Character> list = svc2.findMissingLetters(exampleStringForNegetiveTest);
		assertEquals(1, list.size());

	}
}
