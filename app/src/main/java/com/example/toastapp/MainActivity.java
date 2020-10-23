package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txd1, txd2;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txd1 = findViewById(R.id.txd1);
        txd2 = findViewById(R.id.txd2);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tx1, tx2;
                tx1 = txd1.getText().toString();
                tx2 = txd2.getText().toString();
                 if(tx1.length()==0){
                     txd1.requestFocus();
                     txd1.setError("Missing Text");

                 }else if(tx2.length()==0){
                     txd2.requestFocus();
                     txd2.setError("Missing Text");
                     
                 }

            }
        });

    }
}