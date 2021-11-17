package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		  String text="Paypal India"; char[] CharArray= text.toCharArray();
		  
		  Set<Character> txt= new LinkedHashSet<Character>();
		  System.out.println("The Given String : "+text);
		  
		  System.out.println(); for (char c : CharArray) { txt.add(c); }
		  System.out.println("Removed Duplicates"+txt);
		 
		
		String text1 = "We learn java basics as part of java sessions in java week1";
		System.out.println("The given string is :"+text1);
		String[] splitText = text1.split(" ");
		String sentence=Arrays.toString(splitText); //instead of using for loop using a method Arrays.toString()
		System.out.println(" "+ sentence);
		
		List<String> senList=new ArrayList<String>(Arrays.asList(splitText));
		Set<String> duplicate= new LinkedHashSet<String>(senList);
		System.out.println("Removing duplicates: "+duplicate);
		
		
		
		
	}}
