package com.handmark.pulltorefresh.library;

/**
 * This is an extra listener, that gets informed, when an over scroll limit has
 * exceeded
 */
public interface OverscrollLimitExceededListener {

	/**
	 * The overscroll direction to determine, if the overscroll was caused by an
	 * top or bottom
	 * 
	 * @author Hannes Dorfmann
	 * 
	 */
	public enum OverscrollDirection {
		/**
		 * INDICATES that the overscoll was on the top
		 */
		TOP,

		/**
		 * Indicates that the overscroll was on the bottom
		 */
		BOTTOM
	}

	/**
	 * Set the limit, when you want to get informed about the exceeding
	 */
	public int getLimit();

	/**
	 * Called when the limit ({@link #getLimit()}) has been exceeded
	 */
	public void onExceeded(OverscrollDirection direction);

}
