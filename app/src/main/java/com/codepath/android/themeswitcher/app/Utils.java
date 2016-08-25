package com.codepath.android.themeswitcher.app;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by floko_000 on 8/24/2016.
 */
public class Utils {
    private static int sTheme;

    public final static int THEME_MATERIAL_LIGHT = 0;
    public final static int THEME_NICOLE_THEME_1 = 1;
    public final static int THEME_NICOLE_THEME_2 = 2;
    public final static int THEME_NICOLE_THEME_3 = 3;

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
        activity.overridePendingTransition(android.R.anim.fade_in,
                android.R.anim.fade_out);
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case THEME_MATERIAL_LIGHT:
                activity.setTheme(R.style.Theme_Material_Light);
                break;
            case THEME_NICOLE_THEME_1:
                activity.setTheme(R.style.Theme_Nicole_Theme_1);
                break;
            case THEME_NICOLE_THEME_2:
                activity.setTheme(R.style.Theme_Nicole_Theme_2);
                break;
            case THEME_NICOLE_THEME_3:
                activity.setTheme(R.style.Theme_Nicole_Theme_3);
                break;
        }
    }
}