package com.siberiadante.titlelayoutlib;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * @Created SiberiaDante
 * @Describe：
 * @Time: 2017/9/13
 * @UpDate:
 * @Email: 994537867@qq.com
 * @GitHub: https://github.com/SiberiaDante
 */

public class TitleLayoutLib {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public TitleLayoutLib() {
        throw new UnsupportedOperationException("Use this lib,you need init first! In your Application: TitleLayoutLib.initLib(context);");
    }

    public static void init(Context context) {
        TitleLayoutLib.context = context;
    }

    public static Context getContext() {
        if (context != null) {
            return context;
        } else {
            throw new NullPointerException("Use this lib,you need init first! In your Application: TitleLayoutLib.initLib(context);");

        }
    }

}
