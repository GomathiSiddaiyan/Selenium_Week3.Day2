package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SortingUsingCollection {

	public static void main(String[] args) {

//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> in = new LinkedList<String>();
		in.add("HCL");
		in.add("Wipro");
		in.add("Aspire Systems");
		in.add("CTS");

//		get the length of the array		
		int len = in.size();
		System.out.println("The length of the List is : " + len);

//		sort the array			
		Collections.sort(in);

//		Iterate it in the reverse order
		Collections.reverse(in);
		System.out.println("Sorted in Ascending order: " + in);
//		print the array
		System.out.println("The Reverse list is: " + in);

//		Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
