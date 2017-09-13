package com.siberiadante.titlelayout;

import android.app.Application;

import com.siberiadante.titlelayoutlib.TitleLayoutLib;

/**
 * @Created SiberiaDante
 * @Describe：
 * @Time: 2017/9/13
 * @UpDate:
 * @Email: 994537867@qq.com
 * @GitHub: https://github.com/SiberiaDante
 */

public class MyApplication extends Application {
    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        TitleLayoutLib.init(mInstance);
    }
}
