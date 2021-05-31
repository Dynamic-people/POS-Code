package com.smpexample.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class OrderDetailsActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        listView = findViewById(R.id.listview);

        ArrayList<ListData> listViewData = new ArrayList<>();
        for (int i=0; i<10; ++i)
        {
            ListData listData = new ListData();

            listData.mainImage = R.drawable.ic_launcher_foreground;
            listData.star = R.drawable.ic_launcher_foreground;

            listData.title = " 테스트"+i;
            listData.body_1 = " / 리뷰51+ / 사장님댓글13+ / 410m";
            listData.body_2 = "음료값 3000원 / 제조시간 10~15";

            listViewData.add(listData);
        }


        ListAdapter oAdapter = new CustomListView(listViewData);
        listView.setAdapter(oAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickName = listViewData.get(position).title;
                Log.d("확인","name : "+clickName);
            }
        });
    }
}