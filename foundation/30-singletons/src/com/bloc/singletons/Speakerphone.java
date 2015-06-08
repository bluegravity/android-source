package com.bloc.singletons;

import java.util.HashSet;
import java.util.Iterator;

/************************************************
 * ASSIGNMENT: Populate this class with the defined methods.
 *
 * This is a singleton class which maintains communication between Talker and
 * Listener interface objects. /
 ************************************************/

public class Speakerphone extends Object {

	public static Speakerphone spPhone;
	private HashSet<Listener> phoneList = new HashSet<>();

	/*
	 * get
	 * 
	 * @return the singleton instance of Speakerphone (Speakerphone)
	 */
	/************************************************
	 * ASSIGNMENT: Implement the get method /
	 ************************************************/

	public static Speakerphone get() {
		if (spPhone == null) {
			spPhone = new Speakerphone();
		}
		return spPhone;
	}

	/*
	 * addListener
	 * 
	 * Add a listener to Speakerphone's list
	 * 
	 * @param listener an instance of the Listener interface (Listener)
	 * 
	 * @return nothing
	 */
	/************************************************
	 * ASSIGNMENT: Implement the addListener method /
	 * 
	 * @return
	 ************************************************/

	void addListener(Listener listener) {
		phoneList.add(listener);
	}

	/*
	 * removeListener
	 * 
	 * Remove a Listener from the Speakerphone's list
	 * 
	 * @param listener the Listener to remove (Listener)
	 * 
	 * @return nothing
	 */
	/************************************************
	 * ASSIGNMENT: Implement the removeListener method /
	 ************************************************/
	void removeListener(Listener listener) {
		phoneList.remove(listener);
	}

	/*
	 * removeAll
	 * 
	 * Removes all Listeners from Speakerphone
	 * 
	 * @return nothing
	 */
	/************************************************
	 * ASSIGNMENT: Implement the removeAll method /
	 ************************************************/
	void removeAll() {
		phoneList.clear();
	}

	/*
	 * contains
	 * 
	 * Checks whether a Listener is found in the Speakerphone's collection.
	 * 
	 * @param listener
	 * 
	 * @return `true` if the Listener has already been added to the
	 * Speakerphone, `false` otherwise (boolean)
	 */
	/************************************************
	 * ASSIGNMENT: Implement the contains method /
	 ************************************************/
	boolean contains(Listener listener) {
		return phoneList.contains(listener);
	}

	/*
	 * shoutMessage
	 * 
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 * 
	 * @param talker a Talker whose message will be sent (Talker)
	 * 
	 * @return nothing
	 */
	/************************************************
	 * ASSIGNMENT: Implement the shoutMessage method /
	 ************************************************/

	void shoutMessage(Talker talker) {
		Iterator<Listener> iter = phoneList.iterator();
		String message = talker.getMessage();
		while (iter.hasNext()) {
			iter.next().onMessageReceived(message);
		}
	}

	/*
	 * shoutMessage
	 * 
	 * Sends the message to all of the Listeners which are instances of the cls
	 * parameter
	 * 
	 * @param talker a Talker whose message will be sent (Talker)
	 * 
	 * @param cls a Class object representing the type which the Listener should
	 * extend from in order to receive the message (Class)
	 * 
	 * @return nothing
	 * 
	 * HINT: see Class.isAssignableFrom()
	 * http://docs.oracle.com/javase/7/docs/api
	 * /java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	/************************************************
	 * ASSIGNMENT: Implement the shoutMessage method /
	 ************************************************/
	void shoutMessage(Talker talker, Class cls) {
		Iterator<Listener> iter = phoneList.iterator();
		String message = talker.getMessage();
		while (iter.hasNext()) {
			// shout if of correct class
			Listener listener = iter.next();
			if (listener.getClass().isAssignableFrom(cls)) {
				listener.onMessageReceived(message);
			}

		}
	}
}