package com.example.latihanintentpassingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.text_viewdata);
        Bundle bundle = getIntent().getExtras();
        String s= bundle.getString("name");
        textView.setText(s);


    }
}
