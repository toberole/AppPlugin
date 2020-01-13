package com.cat.zeus.appplugin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_test = findViewById(R.id.tv_test);
        tv_test.setText("hello test");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Object add(Object o, int a, int b) {
        return new Object();
    }
}
