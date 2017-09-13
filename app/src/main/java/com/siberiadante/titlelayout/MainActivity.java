package com.siberiadante.titlelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.siberiadante.titlelayoutlib.utils.ScreenUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScreenUtil.setStatusTranslucent(this);
    }
}
