package com.example.intetntexample_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = findViewById(R.id.editText);

    }

    public void onOpenThirdActivity(View view) {
        Intent thirdActivityIntent = new Intent(this, ThirdActivity.class);
        int editIntMessage = Integer.parseInt(editText.getText().toString());
        thirdActivityIntent.putExtra("toSecondActivity", editIntMessage);
        startActivity(thirdActivityIntent);
    }
}
