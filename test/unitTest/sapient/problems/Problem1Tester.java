package unitTest.sapient.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import test.sapientInterview.models.ModelForProblem1;
import test.sapientInterview.models.ModelForProblem1Question2;
import test.sapientInterview.svc.Problem1Svc;

public class Problem1Tester {
	Problem1Svc svc1;
	List<ModelForProblem1Question2> listForQuestion2;
	List<ModelForProblem1> listForQuestion1;
	String exmpleStrForPositiveTest;
	String exampleStringForNegetiveTest;
	List<ModelForProblem1> expected;

	@Before
	public void initiateDataForQ1() {
		// Problem1Tester tester = new Problem1Tester();
		svc1 = new Problem1Svc();
		listForQuestion2 = new ArrayList<>();
		listForQuestion1 = new ArrayList<>();
		exmpleStrForPositiveTest = "aadlfhiwwwdwldhwql4444";
		exampleStringForNegetiveTest = "NoConsecutiveRepetation";

	}

	@Test
	public void testForConsecutiveRepetationList() {

		// assertEquals(expected,
		// svc1.listConsecutiveOccurancesvc(exmpleStrForPositiveTest));
		List<ModelForProblem1> actualList = svc1.listConsecutiveOccurancesvc(exmpleStrForPositiveTest);
		assertTrue(actualList.contains(new ModelForProblem1("www", 3)));
		assertTrue(actualList.contains(new ModelForProblem1("aa", 2)));
		assertTrue(actualList.contains(new ModelForProblem1("4444", 4)));

	}

	@Test
	public void testForHeighestRepetationList() {
		List<ModelForProblem1> actualList = svc1.listConsecutiveOccurancesvc(exmpleStrForPositiveTest);
		actualList = svc1.countHeighestOccurance(actualList);
		assertEquals(1, actualList.size());
		assertTrue(actualList.contains(new ModelForProblem1("4444", 4)));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testForNoConsecutiveRepetationList() {
		List<ModelForProblem1> actualList = svc1.listConsecutiveOccurancesvc(exampleStringForNegetiveTest);
		actualList = svc1.countHeighestOccurance(actualList);

	}

	@Test
	public void testForMultipleHeighestRepetationList() {
		List<ModelForProblem1> actualList = svc1.listConsecutiveOccurancesvc("aaaalfhiwwwdwlqqdhwql4444");
		actualList = svc1.countHeighestOccurance(actualList);
		assertEquals(2, actualList.size());
		assertTrue(actualList.contains(new ModelForProblem1("4444", 4)));
		assertTrue(actualList.contains(new ModelForProblem1("aaaa", 4)));
	}

	@Test
	public void testForAlphaOrNumAnalysis() {
		List<ModelForProblem1Question2> actualList = svc1.isAlphaOrNum("123abc");

		assertEquals(6, actualList.size());

	}

}
