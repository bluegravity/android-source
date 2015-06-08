package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 * 
	 * Takes a list of numbers and finds the largest among them using recursive
	 * calls.
	 * 
	 * @param numbers a list of numbers, can be odd or even numbered
	 * 
	 * @return the largest number in the list
	 * 
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		/************************************************
		 * ASSIGNMENT: Implement this method, the return value must change /
		 ************************************************/

		// This is probably what most people come up with
		// because the lesson teaches splitting the collection 
		// into TWO recursive calls. I find that to be very confusing.
		
		// base case is ONE number left in List
//		if (numbers.size() == 1)
//			return numbers.get(0);
//
//		List<Integer> bottomHalf = numbers.subList(0, numbers.size() / 2);
//		int bottom = findMaxRecursively(bottomHalf);
//
//		List<Integer> topHalf = numbers.subList(numbers.size() / 2,
//				numbers.size());
//		int top = findMaxRecursively(topHalf);
//
//		return top > bottom ? top : bottom;
		
		//
		// A solution using one recursive call stack
		//
		
		// if we are at the bottom of the rabbit hole
		// pass the lower-most value up
		if (numbers.size() == 1)
			return numbers.get(0);
		
		// System.out.println(numbers.size());
		
		// otherwise, get the challenger from the function 
		// while passing the function a smaller list with the lowest element removed
		int previousLeftMost = findMaxRecursively(numbers.subList(1, numbers.size()));
		
		// System.out.println("comparing: " + previousLeftMost + ":" + numbers.get(0));
		
		// compare the challenger coming up from recursion
		// to the (larger) list's lowest element
		// return the largest value up through the stack
		if(previousLeftMost > numbers.get(0))
			return previousLeftMost;
		else
			return numbers.get(0);
		}
}
