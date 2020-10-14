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

                condition();
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



    public void condition() {

        Intent intent = new Intent(mContext, All_Web_Pages.class);

        ifconditions();

        intent.putExtra("Web", string);
        mContext.startActivity(intent);
    }

    public void ifconditions() {

        if (id == 0) {
            string = "https://www.prothomalo.com/";
        }
        if (id == 1) {
            string = "http://www.bd-pratidin.com/";
        }
        if (id == 2) {
            string = "https://www.kalerkantho.com/";
        }
        if (id == 3) {
            string = "https://www.jugantor.com/";
        }
        if (id == 4) {
            string = "https://www.bbc.com/bengali";
        }
        if (id == 5) {
            string = "https://www.bhorerkagoj.com/";
        }
        if (id == 6) {
            string = "https://chakrirkhobor.com.bd/";
        }
        if (id == 7) {
            string = "https://samakal.com/";
        }
        if (id == 8) {
            string = "http://web.dailyjanakantha.com/";
        }
        if (id == 9) {
            string = "http://www.dainikshiksha.com/";
        }
        if (id == 10) {
            string = "https://www.sharebazarnews.com/";
        }
        if (id == 11) {
            string = "https://www.somoynews.tv/";
        }
        if (id == 12) {
            string = "http://www.ittefaq.com.bd/";
        }
        if (id == 13) {
            string = "http://www.alokitobangladesh.com/";
        }
        if (id == 14) {
            string = "https://www.manobkantha.com.bd/";
        }
        if (id == 15) {
            string = "http://www.bssnews.net/";
        }
        if (id == 16) {
            string = "http://www.dailynayadiganta.com/";
        }
        if (id == 17) {
            string = "http://bonikbarta.net/";
        }
        if (id == 18) {
            string = "https://www.banglanews24.com/";
        }
        if (id == 19) {
            string = "http://www.dhakatimes24.com/";
        }
        if (id == 20) {
            string = "https://dmpnews.org/";
        }
        if (id == 21) {
            string = "http://www.dainikamadershomoy.com/";
        }
        if (id == 22) {
            string = "https://www.dailykaratoa.com/";
        }
        if (id == 23) {
            string = "http://dainikpurbokone.net/";
        }
        if (id == 24) {
            string = "http://www.dailysangram.com/";
        }
        if (id == 25) {
            string = "http://www.poriborton.news/";
        }
        if (id == 26) {
            string = "https://www.jagonews24.com/";
        }
        if (id == 27) {
            string = "http://www.somoyerkonthosor.com/";
        }
        if (id == 28) {
            string = "https://www.priyo.com/";
        }
        if (id == 29) {
            string = "https://dainikazadi.net/";
        }
        if (id == 30) {
            string = "https://www.dailyinqilab.com/";
        }
        if (id == 31) {
            string = "http://www.risingbd.com/";
        }
        if (id == 32) {
            string = "https://techshohor.com/";
        }
        if (id == 33) {
            string = "http://www.jaijaidinbd.com/";
        }
        if (id == 34) {
            string = "https://bangla.dhakatribune.com/";
        }
        if (id == 35) {
            string = "http://www.mzamin.com/";
        }
        if (id == 36) {
            string = "https://bangla.bdnews24.com/";
        }


    }


}
