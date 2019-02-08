package com.example.jieke_one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity_test_activity extends AppCompatActivity {
    private TextView tv;
//    this is new content
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test_activity);
        Intent i=getIntent();
        tv=findViewById(R.id.tv);
        tv.setText(i.getStringExtra("data"));

    }
}
