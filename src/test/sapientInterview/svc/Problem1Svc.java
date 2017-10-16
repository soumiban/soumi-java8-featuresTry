package test.sapientInterview.svc;

/**
 * @author soumi
 * @Description segregated the service class from main launcher to contain all the business logic
 * 
 */


import java.util.ArrayList;
import java.util.List;

import test.sapientInterview.models.ModelForProblem1;
import test.sapientInterview.models.ModelForProblem1Question2;

public class Problem1Svc {



	public List<ModelForProblem1> countHeighestOccurance(List<ModelForProblem1> list) {
		List<ModelForProblem1> listOfHeighestOccurance = new ArrayList<>();
		
		list.sort((ModelForProblem1 m1, ModelForProblem1 m2) -> m2.getOccuranceCount() - m1.getOccuranceCount());

		System.out.println("The character that repeats consecutively are as below:");
		list.forEach((model) -> System.out.println(model.getCharList() + " : " + model.getOccuranceCount()));

		System.out.println("And the one with the heigest repeat is/are clearly: ");
		System.out.println(list.get(0).getCharList() + " : " + list.get(0).getOccuranceCount());

		listOfHeighestOccurance.add(list.get(0));
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).getOccuranceCount() == list.get(i + 1).getOccuranceCount()) {
				System.out.println(list.get(i + 1).getCharList() + " : " + list.get(i + 1).getOccuranceCount());
				listOfHeighestOccurance.add(list.get(i+1));
			} else
				break;
		}

		return listOfHeighestOccurance;
	}

	public List<ModelForProblem1Question2> isAlphaOrNum(String str) {

		List<ModelForProblem1Question2> listWithType = new ArrayList<>();
		char[] arr = str.toCharArray();
		for (Character character : arr) {
			if (Character.isLetter(character)) {
				System.out.println(character + " is a letter.");
				listWithType.add(new ModelForProblem1Question2(character, "letter/alpha"));
			} else if (Character.isDigit(character)) {
				System.out.println(character + " is a number.");
				listWithType.add(new ModelForProblem1Question2(character, "Number/NUmeric"));
			} else {
				System.out.println(character + " is neither num or char.");
				listWithType.add(new ModelForProblem1Question2(character, "sign/specialchar"));
			}
		}

		return listWithType;
	}

	public List<ModelForProblem1> listConsecutiveOccurancesvc(String strToTest) {

		List<ModelForProblem1> listOfConsecutiveOccurance = new ArrayList<ModelForProblem1>();
		String strToAdd = "";
		int count = 1;
		int length = strToTest.length();
		for (int i = 0; i < length-1 ; i++) {
			// char elementInStr = strToTest.charAt(i);
			if (strToTest.charAt(i) == strToTest.charAt(i + 1)) {
				count = count + 1;
				if (strToAdd.equals(""))
					strToAdd = strToAdd + strToTest.substring(i, i + 2);

				else
					strToAdd = strToAdd + strToTest.substring(i + 1, i + 2);

				i = i++;
			} else {
				if (strToAdd.length() > 1) {
					listOfConsecutiveOccurance.add(new ModelForProblem1(strToAdd, count));
					strToAdd = "";
					count = 1;
				}
			}

		}
		if (strToAdd.length() > 1) {
			listOfConsecutiveOccurance.add(new ModelForProblem1(strToAdd, count));
			strToAdd = "";
			count = 1;
		}

		return listOfConsecutiveOccurance;
	}

}
