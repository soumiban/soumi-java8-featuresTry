package test.sapientInterview.svc;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem2Svc {
	static Set<Character> alphabets = new HashSet<Character>();
	
	public Set<Character> findMissingLetters(String exampleStr) {

		listAlphabets();
		Set<Character> exampleSet = new HashSet<>();
		if (!exampleStr.isEmpty()) {

			exampleSet = exampleStr.toLowerCase().chars().mapToObj(e -> (char) e).collect(Collectors.toSet());

			// char[] exampleStrArray = .toLowerCase().toCharArray();
			// Set<Character> exampleSet = new
			// HashSet(Arrays.asList(exampleStrArray));

			alphabets.removeAll(exampleSet);
			if (!alphabets.isEmpty())
				alphabets.forEach((c) -> System.out.println(c));
			else
				System.out.println("Bingo!! you passed a Pangram sentence! ");
		} else
			System.out.println("its an empty String");

		return alphabets;
	}

	static Set<Character> listAlphabets() {
		for (char c = 'a'; c <= 'z'; c++) {
			alphabets.add(c);

		}
		return alphabets;
	}
}
