package test.sapient.problems;

/**
 * @author soumi
 * @ProblemStatement 

                For any alphanumeric string, (example string below) develop a solution in Java for the 
                questions below without any external help. Send your solution in a .txt file.
 
                Example String:
                 
                24541pfxof1xkygp08u0wkdhh26u6tn2gcaq0sa31ifiqftilk5xj7ggg8giap6p333inf9luj3sxpp2se9ak957dtttttmoz8vfqbrdo3rs
 
                Question #1
                Find the character that repeats consecutively the highest number of times on the string.
                E.g. On the String 'aq62a4abkkk2eh4444se' 4 repeats 4 times consecutively.
 
                Question # 2
                For each character determine if it is an Alpha or Numeric character.
 
 * @estimated time 40 minutes
 * @Date 10/13/17
 **/

import java.util.ArrayList;
import java.util.List;

import test.sapientInterview.models.ModelForProblem1;
import test.sapientInterview.models.ModelForProblem1Question2;
import test.sapientInterview.svc.Problem1Svc;

public class Problem1Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem1Svc svc = new Problem1Svc();
		// String exampleStr = "24541pfxof1xkygp08u0wkdhh26u6tn2gcaq0sa31ifiqftilk5xj7ggggg8giap6p333inf9luj3sxpp2se9ak957dtttttmoz8vfqbrdo3rs";
		 String exampleStr = "soumi";
		int length = 0;
		List<ModelForProblem1> list = svc.listConsecutiveOccurancesvc(exampleStr);
		list = svc.countHeighestOccurance(list);
		System.out.println(list.size());
		System.out.println("To analize each char of the given string, whether akpha or numeric, here we go.. :");
		svc.isAlphaOrNum(exampleStr);

	}

	
}
