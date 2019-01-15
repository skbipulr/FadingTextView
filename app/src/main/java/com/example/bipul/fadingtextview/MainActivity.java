package com.example.bipul.fadingtextview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tomer.fadingtextview.FadingTextView;

public class MainActivity extends AppCompatActivity {
    FadingTextView fadingTextView;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadingTextView = findViewById(R.id.finingTextView);
        fadingTextView.setTimeout(FadingTextView.SECONDS,2);
    }
}
