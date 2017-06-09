package com.infinitysports.designwithmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * Created by HOME on 27-12-2016.
 */
public class ImageViewPefectSquare extends ImageButton {

    public ImageViewPefectSquare(Context context) {
        super(context);
    }

    public ImageViewPefectSquare(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageViewPefectSquare(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth = getDefaultSize(getSuggestedMinimumWidth(),
                widthMeasureSpec);
        int measuredHeight = getDefaultSize(getSuggestedMinimumHeight(),
                heightMeasureSpec);
        // Ensure this view is always square.
        int min = Math.min(measuredHeight, measuredWidth);
        setMeasuredDimension(min, min);
    }
}