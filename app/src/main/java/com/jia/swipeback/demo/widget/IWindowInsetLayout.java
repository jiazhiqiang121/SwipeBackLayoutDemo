package com.jia.swipeback.demo.widget;

import android.graphics.Rect;
import android.support.v4.view.WindowInsetsCompat;

/**
 * Created by tonyjia on 2018/5/2.
 */

public interface IWindowInsetLayout {

    boolean applySystemWindowInsets19(Rect insets);

    boolean applySystemWindowInsets21(WindowInsetsCompat insets);
}
