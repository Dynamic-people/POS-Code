package com.smpexample.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StarbucksCateActivity extends AppCompatActivity {

    Button btnStarList, btnStarChatting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnStarList = findViewById(R.id.btnEdiyaList);
        btnStarChatting = findViewById(R.id.btnEdiyaChatting);




        btnStarList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),StarbucksPOSActivity.class);
                startActivity(intent2);


            }
        });

        btnStarChatting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),);
                startActivity(intent2);

            }
        });


    }
}