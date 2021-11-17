package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollection {

	public static void main(String[] args) {
		//// Here is the input
		// int[] data = {3,2,11,4,6,7};
		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */

		// int[] data = {3,2,11,4,6,7};

		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		System.out.println("The Given list order is: " + arr);

		int len = arr.size();
		int len1 = arr.get(arr.size() - 2);
		System.out.println("The Length of the given list is: " + len);

		Collections.sort(arr);
		System.out.println("List values arranged in Ascending order" + arr);

		System.out.println("The Second largest number in list is: " + len1);

	}

}
