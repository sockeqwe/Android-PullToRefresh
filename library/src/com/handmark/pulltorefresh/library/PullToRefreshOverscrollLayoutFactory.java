package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;

import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Orientation;
import com.handmark.pulltorefresh.library.internal.LoadingLayout;

/**
 * This factory allows you to easily create custom header and footer views
 * 
 * @author Hannes Dorfmann
 * 
 */
public interface PullToRefreshOverscrollLayoutFactory {

	/**
	 * Create a loading layout
	 * 
	 * @param context
	 * @param mode
	 * @param scrollDirection
	 * @param attrs
	 * @return
	 */
	public LoadingLayout createRotateLoadingLayout(Context context, Mode mode,
			Orientation scrollDirection, TypedArray attrs);

	/**
	 * Create a flipping layout
	 * 
	 * @param context
	 * @param mode
	 * @param scrollDirection
	 * @param attrs
	 * @return
	 */
	public LoadingLayout createFlipLoadingLayout(Context context, Mode mode,
			Orientation scrollDirection, TypedArray attrs);
}
