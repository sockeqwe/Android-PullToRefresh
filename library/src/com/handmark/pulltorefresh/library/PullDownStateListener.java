package com.handmark.pulltorefresh.library;

/**
 * This listener adds the ability to determine, when a pull down has been
 * started
 * 
 * @author Hannes Dorfmann
 * 
 */
public interface PullDownStateListener {

	/**
	 * This method gets called, when the pull down has started, and the header
	 * view is visible (for some pixels)
	 */
	public void onPullDownStarted();

	/**
	 * This method gets called, when the pull down has been finished and the
	 * header is not visible anymore
	 */
	public void onPullDownFinished();

}
