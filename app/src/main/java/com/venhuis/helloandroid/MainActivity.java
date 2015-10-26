package com.venhuis.helloandroid;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout lay = new LinearLayout(this);
        lay.setOrientation(LinearLayout.VERTICAL);
        TextView text = new TextView(this);
        text.setText("Hello Android!");
        lay.addView(text);
        text = new TextView(this);
        text.setText("Hello Android!");
        lay.addView(text);
        text = new TextView(this);
        text.setText("Hello Android!");
        lay.addView(text);

        TextView tv = new TextView(this);
        tv.setText("My second Android App");
        setContentView(lay);
        Log.d("seb", "onCreate");
    }

    @Override
    protected  void onStart()
    {
        super.onStart();
        Log.d("seb", "onStart");
    }

    @Override
    protected  void onRestart()
    {
        super.onRestart();
        Log.d("seb", "onRestart");
    }

    @Override
    protected  void onResume()
    {
        super.onResume();
        Log.d("seb", "onResume");
    }

    @Override
    protected  void onPause()
    {
        super.onPause();
        Log.d("seb", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("seb", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("seb", "onStop");
    }
}
