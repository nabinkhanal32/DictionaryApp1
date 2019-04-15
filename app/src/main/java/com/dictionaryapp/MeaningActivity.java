package com.dictionaryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MeaningActivity extends AppCompatActivity
{
    private TextView tvMeaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_meaning);

        Bundle bundle = getIntent().getExtras();

        if (bundle !=null)
        {
            String meaning = bundle.getString("meaning");
            tvMeaning = findViewById(R.id.tvMeaning);
            tvMeaning.setText(meaning);
        }
        else
        {
            Toast.makeText(this, "No meaning", Toast.LENGTH_SHORT).show();
        }

    }

}
