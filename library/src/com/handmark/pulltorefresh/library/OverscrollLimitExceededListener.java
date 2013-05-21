package com.handmark.pulltorefresh.library;

/**
 * This is an extra listener, that gets informed, when an over scroll limit has
 * exceeded
 */
public interface OverscrollLimitExceededListener {

	/**
	 * Set the limit, when you want to get informed about the exceeding
	 */
	public int getLimit();

	/**
	 * Called when the limit ({@link #getLimit()}) has been exceeded
	 */
	public void onExceeded();

}
