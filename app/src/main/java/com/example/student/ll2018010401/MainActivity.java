package com.example.student.ll2018010401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //TextView tv=new TextView(this);
        //tv.setText("HelloWorld");


        Button bt=new Button(this);
        bt.setText("ClickMe");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "笑起來", Toast.LENGTH_SHORT).show();
            }
        });

        Button bt2=new Button(this);
        bt2.setText("ClickMe2");
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "2起來", Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout layout=new LinearLayout(this);
        //layout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(bt);
        layout.addView(bt2);

        setContentView(layout);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int h=dm.heightPixels;
        int w=dm.widthPixels;
        Toast.makeText(MainActivity.this, h+","+w, Toast.LENGTH_SHORT).show();
    }
}
