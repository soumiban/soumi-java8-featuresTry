package test.sapient.problems;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import test.sapientInterview.svc.Problem2Svc;

/**
 * @author soumi
 * 
 * @ProblemStatement
 * 
 * 					Pangram Detector: The sentence that contains every single
 *                   letter in the alphabet. Such sentences are called pangrams.
 *                   e.g. "The quick brown fox jumps over a lazy dog."
 * 
 *                   1. Write a function “findMissingLetters”, which takes a
 *                   String `sentence`, and returns all the letters/alphabets it
 *                   is missing (which prevent it from being a pangram).
 * 
 *                   2. You should ignore the case of the letters in sentence,
 *                   and your return should be all lower case letters, in
 *                   alphabetical order.
 * 
 * @estimated time 40 minutes
 * @Date 10/13/17
 * 
 * 
 */

public class Problem2Launcher {

	

	public static void main(String[] args) {
		
		String exampleStr = "The quick brown fox jumps over a lazy dog.";
		new Problem2Svc().findMissingLetters(exampleStr);
	}

	
}
