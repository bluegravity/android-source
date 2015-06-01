package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 * ASSIGNMENT: Fix code and comments below this block /
	 ************************************************/

	public static void main(String[] args) {
		// get magic number
		int magicNumber = WorstPractices.animals(false);
		System.out.println(magicNumber);
		magicNumber *= 5;
		
		// if magicNumber greater than 18, 
		// reduce to zero in a really stupid way
		if (magicNumber > 18) {
			while (magicNumber > 0) {
				magicNumber--;
			}
		}

		System.out.println(magicNumber);

		
	}

	// animals
	// this method takes in a single parameter, input. Using a
	// very elaborate and complex algorithm, it calculate a magic number
	// input: a seed which helps generate the magic number
	// returns: a magical number
	private static int animals(boolean input) {

		// set seed based on boolean input
		int seedValue = input ? 34 : 21;
		
		System.out.println("seed " + seedValue);
		float sparklesfairy = .5f;

		// use a loop to multiply by (seed value^seed value)
		for (int i = 0; i < seedValue; i++) {
			sparklesfairy *= seedValue;
			
			System.out.println("SSS " + sparklesfairy);
			
		}
		
		// one more time on the way out!
		return (int) sparklesfairy * seedValue;
	}

	/************************************************
	 * ASSIGNMENT Fix code and comments above this block /
	 ************************************************/
}
