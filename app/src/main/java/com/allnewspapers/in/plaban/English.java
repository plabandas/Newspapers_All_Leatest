package com.allnewspapers.in.plaban;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class English extends Fragment {

    View v;
    Context context;

    RecyclerView myrecyclerview;
    List<Newspapers> firstContact;

    public English() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.english, container, false);
        myrecyclerview = v.findViewById(R.id.contact_recyclerview);

        RecyclerViewAdapterDemo_English recyclerAdapter = new RecyclerViewAdapterDemo_English(getContext(), firstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstContact = new ArrayList<>();


        firstContact.add(new Newspapers(R.drawable.dailystar));
        firstContact.add(new Newspapers(R.drawable.daily_sun));
        firstContact.add(new Newspapers(R.drawable.bbcnews));
        firstContact.add(new Newspapers(R.drawable.cnn));
        firstContact.add(new Newspapers(R.drawable.prothom_alo_eng));
        firstContact.add(new Newspapers(R.drawable.independent_bd));
        firstContact.add(new Newspapers(R.drawable.bangla_news_24_eng));
        firstContact.add(new Newspapers(R.drawable.bdnews24eng));
        firstContact.add(new Newspapers(R.drawable.observerbd));
        firstContact.add(new Newspapers(R.drawable.bangladesh_today));
        firstContact.add(new Newspapers(R.drawable.financialexpress));
        firstContact.add(new Newspapers(R.drawable.news_today_eng));
        firstContact.add(new Newspapers(R.drawable.newyorktimes));
        firstContact.add(new Newspapers(R.drawable.the_gurdian));
        firstContact.add(new Newspapers(R.drawable.googlenews));
        firstContact.add(new Newspapers(R.drawable.usatoday));
        firstContact.add(new Newspapers(R.drawable.foxnews));
        firstContact.add(new Newspapers(R.drawable.skynews));
        firstContact.add(new Newspapers(R.drawable.espn));
        firstContact.add(new Newspapers(R.drawable.new_age));
        firstContact.add(new Newspapers(R.drawable.cnet));

    }
}
