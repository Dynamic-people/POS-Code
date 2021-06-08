package com.smpexample.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwosomeCateActivity extends AppCompatActivity {


    Button btnTwosomeList, btnTwosomeChatting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twosome_cate);

        btnTwosomeList = findViewById(R.id.btnTwosomeList);
        btnTwosomeChatting = findViewById(R.id.btnTwosomeChatting);



        btnTwosomeList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),TwosomePOSActivity.class);
                startActivity(intent2);


            }
        });

        btnTwosomeChatting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),TwosomeListActivity.class);
                startActivity(intent2);

            }
        });


    }
}