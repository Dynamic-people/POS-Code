package com.smpexample.pos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kakao.sdk.user.UserApiClient;
import com.kakao.sdk.user.model.User;

import java.util.ArrayList;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class CustomListView extends RecyclerView.Adapter<CustomListView.CustomViewHolder>
{
    private ArrayList<Menu> arrayList;
    private Context context;
    //어댑터에서 액티비티 액션을 가져올 때 context가 필요한데 어댑터에는 context가 없다.
    //선택한 액티비티에 대한 context를 가져올 때 필요하다.

    public CustomListView(ArrayList<Menu> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }



    //실제 리스트뷰가 어댑터에 연결된 다음에 뷰 홀더를 최초로 만들어낸다.
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderlist_items, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }


        @Override
        public void onBindViewHolder (@NonNull CustomViewHolder holder,int position) {

                  holder.tv_nickname.setText("주문 고객 : " + arrayList.get(position).getNickname());
                    holder.tv_Drink.setText("주문음료 : " + arrayList.get(position).getDrink());
                    holder.tv_OrderTime.setText("주문일시 : " + arrayList.get(position).getFormatDate());
                    holder.tv_Details.setText("요청사항 : " + arrayList.get(position).getDetails());


        }

    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView tv_nickname;
        TextView tv_Drink;
        TextView tv_OrderTime;
        TextView tv_Details;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

          this.tv_nickname = itemView.findViewById(R.id.tv_nickname);
            this.tv_Drink = itemView.findViewById(R.id.tv_Drink);
            this.tv_OrderTime = itemView.findViewById(R.id.tv_OrderTime);
            this.tv_Details = itemView.findViewById(R.id.tv_Details);

        }
    }
}