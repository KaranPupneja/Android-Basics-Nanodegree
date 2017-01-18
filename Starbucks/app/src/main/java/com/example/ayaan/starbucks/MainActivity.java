package com.example.ayaan.starbucks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t2 = (TextView) findViewById(R.id.webs);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
