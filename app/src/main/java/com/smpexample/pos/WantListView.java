package com.smpexample.pos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WantListView extends RecyclerView.Adapter<WantListView.CustomViewHolder>{
    private ArrayList<ChatData> arrayList;
    private Context context;
    //어댑터에서 액티비티 액션을 가져올 때 context가 필요한데 어댑터에는 context가 없다.
    //선택한 액티비티에 대한 context를 가져올 때 필요하다.

    public WantListView(ArrayList<ChatData> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }



    //실제 리스트뷰가 어댑터에 연결된 다음에 뷰 홀더를 최초로 만들어낸다.
    public WantListView.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wantlist_item, parent, false);
        WantListView.CustomViewHolder holder = new WantListView.CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.nickname.setText("고객 이름 :" + arrayList.get(position).getName());
        holder.message.setText("문의 사항 :"+arrayList.get(position).getMsg());
    }



    @Override
    public int getItemCount() {
        return (arrayList != null ? arrayList.size() : 0);
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView nickname;
        TextView message;



        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            this.nickname = itemView.findViewById(R.id.nickname);
            this.message = itemView.findViewById(R.id.massage);

        }
    }
}
