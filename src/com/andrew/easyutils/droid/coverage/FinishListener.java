package com.andrew.easyutils.droid.coverage;

public interface FinishListener {
	void onActivityFinished();
	void dumpIntermediateCoverage(String filePath);
}
