package com.telemetry.outputsleepapp.font;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Locale;

public enum SomeFont {
    CALIBRI("font/Calibri.ttf"),
    CALIBRIB("font/CalibriB.ttf");

    private final String fileName;
    private Float size;

    SomeFont(String fileName) {

        this.fileName = fileName;

    }

    SomeFont(String fileName, float size) {
        this.fileName = fileName;
        this.size = size;
    }

    static SomeFont fromString(String fontName) {

        return SomeFont.valueOf(fontName.toUpperCase(Locale.US));

    }

    public Typeface asTypeface(Context context) {

        return Typeface.createFromAsset(context.getAssets(), fileName);

    }

    public float getSize() {

        return size;

    }
}
