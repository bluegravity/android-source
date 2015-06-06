package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/
//		Edit Main.java, put a bunch of Toys in the ToyBox 
//		by creating several Toy instances 
//		using the classes found in the com.bloc.generics.things package.
		
		// FancyArray<Integer> myFancyIntegerArray = new FancyArray<Integer>();
		
		Toy<Thing> book = new Toy<Thing>(new Book());		
		Toy<Thing> actionFigure = new Toy<Thing>(new ActionFigure());
		Toy<Thing> spoon = new Toy<Thing>(new Spoon());
		
		toyBox.addToy(book);
		toyBox.addToy(actionFigure);
		toyBox.addToy(spoon);

		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
