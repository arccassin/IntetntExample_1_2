package com.example.intetntexample_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent gettingIntent = getIntent();
        Integer getIntFromSecondActivity = gettingIntent.getIntExtra("toSecondActivity", 0);
        TextView textView = findViewById(R.id.newTextView);
        if (getIntFromSecondActivity < 100) {
            textView.setText("Your number so small");
        } else if (getIntFromSecondActivity > 100) {
            textView.setText("Your number so big");
        } else {
            textView.setText("My congratulations");
        }

    }
}
