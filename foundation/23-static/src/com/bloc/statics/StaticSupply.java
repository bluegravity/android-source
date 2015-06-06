package com.bloc.statics;

import com.bloc.statics.appliances.*;

public class StaticSupply extends Object {
	
	// one array for all instances
	private static Appliance[] mAppliances;

	public StaticSupply() {
		this(new Appliance[0]);
	}

	// singleton
	public StaticSupply(Appliance[] appliances) {
		mAppliances = appliances;
	}

	public static void plugAppliance(Appliance appliance) {
		Appliance[] temp = new Appliance[mAppliances.length + 1];
		for (int i = 0; i < mAppliances.length; i++) {
			temp[i] = mAppliances[i];
		}
		temp[mAppliances.length] = appliance;
		mAppliances = temp;
	}

	public static void unplugAppliance(Appliance appliance) {
		for (int i = 0; i < mAppliances.length; i++) {
			if (mAppliances[i] == appliance) {
				mAppliances[i] = null;
			}
		}
	}

	public static boolean hasAppliance(Appliance appliance) {
		for (int i = 0; i < mAppliances.length; i++) {
			if (mAppliances[i] == appliance) {
				return true;
			}
		}
		return false;
	}
}
