package com.allnewspapers.in.plaban;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class RecyclerViewAdapterDemo_Bangla extends RecyclerView.Adapter<RecyclerViewAdapterDemo_Bangla.MyViewHolder> {

    private Context mContext;
    List<Newspapers> mdata;
    int id;
    String string = null;

    public RecyclerViewAdapterDemo_Bangla(Context mContext, List<Newspapers> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.single_row_recycler, parent, false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        vHolder.item_cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = vHolder.getAdapterPosition();

                Toast.makeText(mContext,"Button is Clicked : ID = "+String.valueOf(id),Toast.LENGTH_SHORT).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.img.setAnimation(AnimationUtils.loadAnimation(mContext,R.anim.fade_transition));

        holder.img.setImageResource(mdata.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {


        private ImageView img;
        private CardView item_cardView ;
        

        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.newspaper_pic_demo);
            item_cardView = itemView.findViewById(R.id.item_card_id);
        }

    }


}
