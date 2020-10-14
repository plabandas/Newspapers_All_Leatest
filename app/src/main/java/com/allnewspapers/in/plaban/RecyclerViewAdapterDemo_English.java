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

public class RecyclerViewAdapterDemo_English extends RecyclerView.Adapter<RecyclerViewAdapterDemo_English.MyViewHolder> {

    private Context mContext;
    List<Newspapers> mdata;
    int id;
    String string ;

    public RecyclerViewAdapterDemo_English(Context mContext, List<Newspapers> mdata) {
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

                condition();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.img.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.fade_transition));

        holder.img.setImageResource(mdata.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {


        private ImageView img;
        private CardView item_cardView;


        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.newspaper_pic_demo);
            item_cardView = itemView.findViewById(R.id.item_card_id);
        }

    }




    public void condition() {

        Intent intent = new Intent(mContext, All_Web_Pages.class);

        ifconditions();

        intent.putExtra("Web", string);
        mContext.startActivity(intent);

    }


    public void ifconditions() {

        string = null;

        switch (id) {
            case 0:
                string = "https://www.thedailystar.net/";
                break;
            case 1:
                string = "http://www.daily-sun.com/";
                break;
            case 2:
                string = "https://www.bbc.com/news";
                break;
            case 3:
                string = "https://edition.cnn.com/";
                break;
            case 4:
                string = "https://en.prothomalo.com/";
                break;
            case 5:
                string = "http://www.theindependentbd.com/";
                break;
            case 6:
                string = "https://www.banglanews24.com/english";
                break;
            case 7:
                string = "https://bdnews24.com/";
                break;
            case 8:
                string = "http://www.observerbd.com/";
                break;
            case 9:
                string = "http://thebangladeshtoday.com/";
                break;
            case 10:
                string = "https://www.financialexpress.com/world-news/";
                break;
            case 11:
                string = "http://www.newstoday.com.bd/";
                break;
            case 12:
                string = "https://www.nytimes.com/";
                break;
            case 13:
                string = "https://www.theguardian.com/international";
                break;
            case 14:
                string = "https://news.google.com/";
                break;
            case 15:
                string = "https://www.usatoday.com/";
                break;
            case 16:
                string = "https://www.foxnews.com/";
                break;
            case 17:
                string = "https://news.sky.com/";
                break;
            case 18:
                string = "http://www.espn.com/";
                break;
            case 19:
                string = "http://www.newagebd.net/";
                break;
            case 20:
                string = "https://www.cnet.com/";
                break;
        }
    }
}
