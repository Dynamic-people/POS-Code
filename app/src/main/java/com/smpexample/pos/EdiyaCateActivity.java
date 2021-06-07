package com.smpexample.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EdiyaCateActivity extends AppCompatActivity {


    Button btnEdiyaList, btnEdiyaChatting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ediya_cate);

        btnEdiyaList = findViewById(R.id.btnEdiyaList);
        btnEdiyaChatting = findViewById(R.id.btnEdiyaChatting);



        btnEdiyaList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),EdiyaPOSActivity.class);
                startActivity(intent2);


            }
        });

        btnEdiyaChatting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),);
                startActivity(intent2);

            }
        });


    }
}