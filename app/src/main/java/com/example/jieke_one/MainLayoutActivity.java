package com.example.jieke_one;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_layout);
        setContentView(R.layout.my_layout);
        findViewById(R.id.btnstraty).setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent i=new Intent(MainLayoutActivity.this,MainActivity_test_activity.class);
                //实际上这是一个键值对
                i.putExtra("data","你好，这是主页面的数据");
                startActivity(i);
//                打开一个网页
//                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://baidu.com")));//MainLayoutActivity.this,MainActivity_test_activity.class

            }
        });
    }

}
