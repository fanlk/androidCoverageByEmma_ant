package com.andrew.easyutils.droid.coverage;

import com.calculator.Main;

/**
 * 
 * InstrumentedActivity: extends your project main Activity
 * @author http://clasnake.net/emma_for_android/
 *
 */
public class InstrumentedActivity extends Main {

	private FinishListener mListener;

	public void setFinishListener(FinishListener listener) {
		mListener = listener;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		if (mListener != null) {
			mListener.onActivityFinished();
		}
	}

}
