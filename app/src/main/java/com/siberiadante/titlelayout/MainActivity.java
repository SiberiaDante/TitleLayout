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
//        TitleBarLayout titleBarLayout = (TitleBarLayout) findViewById(R.id.title_layout_one);
//        titleBarLayout.setTitleClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("MainActivity","title 被点击了");
//            }
//        });
//        //设置Titlesize
//        titleBarLayout.setTitleSize(30);
//        //一键设置标题样式
//        titleBarLayout.setTitleStyle("我是标题", 18, ContextCompat.getColor(this, R.color.colorAccent));
//        titleBarLayout.setRightImageClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("MainActivity","右边图片被点击了");
//            }
//        });
    }
}
