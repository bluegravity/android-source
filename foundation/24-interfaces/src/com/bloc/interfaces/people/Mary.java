package com.bloc.interfaces.people;

import com.bloc.interfaces.people.hobbies.Skydiver;

/************************************************
 *	ASSIGNMENT:
 *	Have Mary implement the Skydiver interface
/************************************************/

public class Mary extends Person implements Skydiver{
	public Mary() {
		super("Mary", "Whiters", "Female", 1.65d, 62d, "Blue");
	}

	@Override
	public void getInPlane() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jumpFromPlane() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void releaseParachute() {
		// TODO Auto-generated method stub
		
	}
}