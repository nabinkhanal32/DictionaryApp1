package com.dictionaryapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);

        TextView tvOutput = findViewById(R.id.tvOutput);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            String message = bundle.getString("myMessage");
            tvOutput.setText(message);

        }
        else
        {
            Toast.makeText(this,"No message",Toast.LENGTH_SHORT).show();
        }

    }
}
