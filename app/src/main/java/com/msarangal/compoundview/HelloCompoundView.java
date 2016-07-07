package com.msarangal.compoundview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mandeep on 08-07-2016.
 */
public class HelloCompoundView extends LinearLayout {

    private View mValue;
    private ImageView mImage;

    public HelloCompoundView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.options, 0, 0);
        String titleText = a.getString(R.styleable.options_titleText);
        int colorValue = a.getColor(R.styleable.options_valueColor, ContextCompat.getColor(context, R.color.offwhite));
        a.recycle();

        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER_VERTICAL);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_color_options, this, true);

        TextView title = (TextView) getChildAt(0);
        title.setText(titleText);
        mValue = getChildAt(1);
        mValue.setBackgroundColor(colorValue);
        mImage = (ImageView) getChildAt(2);
    }

    public HelloCompoundView(Context context) {
        this(context, null);

    }

    public void setValueColor(int color) {
        mValue.setBackgroundColor(color);
    }

    public void setImageVisible(boolean visible) {
        mImage.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    public void setImageResource(int rId) {
        mImage.setImageResource(rId);
    }
}
