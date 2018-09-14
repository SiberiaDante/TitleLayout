package com.siberiadante.titlelayout;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.siberiadante.titlelayoutlib.OnMultiTouchListener;
import com.siberiadante.titlelayoutlib.TitleBarLayout;
import com.siberiadante.titlelayoutlib.TitleLayoutListener;
import com.siberiadante.titlelayoutlib.utils.ScreenUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScreenUtil.setStatusTranslucent(this);
//        //设置Titlesize
//        titleBarLayout.setTitleSize(30);
//        //一键设置标题样式
//        titleBarLayout.setTitleStyle("我是标题", 18, ContextCompat.getColor(this, R.color.colorAccent));

        final TitleBarLayout titleBarLayout2 = (TitleBarLayout) findViewById(R.id.title_layout_two);
        titleBarLayout2.setTitle("Java代码设置新的标题");

        final TitleBarLayout titleBarLayout = (TitleBarLayout) findViewById(R.id.title_layout_four);
        titleBarLayout.setIsLeftBackView(true);
        titleBarLayout.setTitleLayoutBackground(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        titleBarLayout.setRightImageClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "右边的图片被点击了", Toast.LENGTH_SHORT).show();
            }
        });

//        titleBarLayout.setTitleClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "标题被点击了", Toast.LENGTH_SHORT).show();
//            }
//        });
        titleBarLayout.setTitleClickListener(new OnMultiTouchListener(new TitleLayoutListener() {
            @Override
            public void onTitleClickListener() {
                Toast.makeText(MainActivity.this, "标题被单击了", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTitleDoubleClickListener() {
                Toast.makeText(MainActivity.this, "标题被双击了", Toast.LENGTH_SHORT).show();

            }
        }));
    }
}
