package com.bloc.statics.appliances;

/************************************************
 *	ASSIGNMENT:
 *	Modify Appliance such that it uses a static copy of
 *	StaticSupply
/************************************************/

import com.bloc.statics.StaticSupply;

public abstract class Appliance extends Object {
	StaticSupply mStaticSupply;

	String mBrandName;
	String mSerialNumber;
	boolean mIsOn;

	/*
	 * performFunction
	 * The function of the appliance will be performed if it is
	 * turned on
	 *
	 * @return true if the function was performed
	 */
	public boolean performFunction() {
		if (isOn()) {
			_performFunction();
			return true;
		}
		return false;
	}

	/*
	 * _performFunction
	 * Protected abstract function to perform, subclasses must override
	 */
	protected abstract void _performFunction();

	/*
	 * flipPowerSwitch()
	 * Flips the power switch on the appliance. Off becomes
	 * on, on becomes off
	 */
	public void flipPowerSwitch() {
		mIsOn = !mIsOn;
	}

	/*
	 * isOn
	 * @return true if the power switch is flipped on and the appliance
	 * 		   is plugged in
	 */
	public boolean isOn() {
		return mStaticSupply == null ? false : StaticSupply.hasAppliance(this) && mIsOn;
	}

	/*
	 * plugIn
	 * Plug the appliance into the power supply
	 */
	public void plugIn() {
		if (mStaticSupply == null) {
			mStaticSupply = new StaticSupply();
		}
		if (!StaticSupply.hasAppliance(this)) {
			StaticSupply.plugAppliance(this);
		}
	}

	/*
	 * unplug
	 * Remove this appliance from the power supplys
	 */
	public void unplug() {
		if (mStaticSupply == null) {
			return;
		}
		StaticSupply.unplugAppliance(this);
	}
}