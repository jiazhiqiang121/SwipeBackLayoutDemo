package com.jia.swipeback.demo.util;

import android.os.Build;
import android.view.Window;

/**
 * Created by tonyjia on 2018/5/2.
 */

public class ViewHelper {
    public static void requestApplyInsets(Window window) {
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            window.getDecorView().requestFitSystemWindows();
        } else if (Build.VERSION.SDK_INT >= 21) {
            window.getDecorView().requestApplyInsets();
        }
    }

}
