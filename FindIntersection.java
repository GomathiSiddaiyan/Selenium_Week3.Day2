package week3.day2;

import java.util.LinkedList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// FindIntersection {

		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		
		List<Integer> n1= new LinkedList<>();
		n1.add(3);
		n1.add(2);
		n1.add(11);
		n1.add(4);
		n1.add(6);
		n1.add(7);
		System.out.println("The First List : "+n1);
		
		List<Integer> n2= new LinkedList<>();
		n2.add(1);
		n2.add(2);
		n2.add(8);
		n2.add(4);
		n2.add(9);
		n2.add(7);
		System.out.println("The Second List : "+n2);
		
		System.out.println("The Intersection values are: ");
		for (int i = 0; i < n1.size(); i++) {
			for (int j = 0; j < n2.size(); j++) {
				
				if((n1.get(i)) == (n2.get(j)))
				{
					System.out.print(" "+n1.get(i));
				}
			}
		}
		
	}}
