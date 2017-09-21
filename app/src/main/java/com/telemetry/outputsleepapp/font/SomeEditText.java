package com.telemetry.outputsleepapp.font;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class SomeEditText extends AppCompatEditText {

    Context context;

    public SomeEditText(Context context) {

        super(context);
        this.context = context;

    }

    public SomeEditText(Context context, AttributeSet attrs) {

        super(context, attrs);
        this.context = context;
       setCustomFont(context, attrs);

    }

    public SomeEditText(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
        this.context = context;
        setCustomFont(context, attrs);

    }

    public boolean setCustomFont(Context context, AttributeSet attrs) {


        String fontName = attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "customFont");

        if (fontName == null) {
            fontName = "calibrib";
        }

        setTypeface(SomeFont.fromString(fontName).asTypeface(context));

        return true;

    }

    public void setCustomFont(SomeFont fontName){

        setTypeface(fontName.asTypeface(context));

        if (fontName.getSize() > 0) {
            setTextSize(fontName.getSize());
        }

    }

}
