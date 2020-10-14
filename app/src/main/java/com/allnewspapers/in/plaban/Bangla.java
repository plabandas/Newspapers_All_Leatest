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

public class Bangla extends Fragment {

    View v;
    Context context;

    RecyclerView myrecyclerview;
    List<Newspapers> firstContact;

    public Bangla() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.bangla, container, false);
        myrecyclerview = v.findViewById(R.id.contact_recyclerview);

        RecyclerViewAdapterDemo_Bangla recyclerAdapter = new RecyclerViewAdapterDemo_Bangla(getContext(), firstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firstContact = new ArrayList<>();


        firstContact.add(new Newspapers(R.drawable.prothom_alo));
        firstContact.add(new Newspapers(R.drawable.bangladesh_protidin));
        firstContact.add(new Newspapers(R.drawable.kalerkontho));
        firstContact.add(new Newspapers(R.drawable.jugantor));
        firstContact.add(new Newspapers(R.drawable.bbc_bangla));
        firstContact.add(new Newspapers(R.drawable.vorer_kagoj));
        firstContact.add(new Newspapers(R.drawable.cakrirkhobor));
        firstContact.add(new Newspapers(R.drawable.somokal));
        firstContact.add(new Newspapers(R.drawable.jonokhonto));
        firstContact.add(new Newspapers(R.drawable.doinik_sikha));
        firstContact.add(new Newspapers(R.drawable.sharenews));
        firstContact.add(new Newspapers(R.drawable.somoy_news));
        firstContact.add(new Newspapers(R.drawable.ittefaq));
        firstContact.add(new Newspapers(R.drawable.alokitobangladesh));
        firstContact.add(new Newspapers(R.drawable.manobkantha));
        firstContact.add(new Newspapers(R.drawable.bssnews));
        firstContact.add(new Newspapers(R.drawable.noyadigonto));
        firstContact.add(new Newspapers(R.drawable.boinikbarta));
        firstContact.add(new Newspapers(R.drawable.bangla_news_24));
        firstContact.add(new Newspapers(R.drawable.dhakatimes24));
        firstContact.add(new Newspapers(R.drawable.dmpnews));
        firstContact.add(new Newspapers(R.drawable.amader_somoy));
        firstContact.add(new Newspapers(R.drawable.karatoa));
        firstContact.add(new Newspapers(R.drawable.purbokon));
        firstContact.add(new Newspapers(R.drawable.songram));
        firstContact.add(new Newspapers(R.drawable.poriborton));
        firstContact.add(new Newspapers(R.drawable.jagonews24));
        firstContact.add(new Newspapers(R.drawable.somoyerkonthosor));
        firstContact.add(new Newspapers(R.drawable.priyo_logo));
        firstContact.add(new Newspapers(R.drawable.ajadi));
        firstContact.add(new Newspapers(R.drawable.inqilab));
        firstContact.add(new Newspapers(R.drawable.rising));
        firstContact.add(new Newspapers(R.drawable.techsohor));
        firstContact.add(new Newspapers(R.drawable.jijadin));
        firstContact.add(new Newspapers(R.drawable.dhaka_tribune));
        firstContact.add(new Newspapers(R.drawable.manobjomin));
        firstContact.add(new Newspapers(R.drawable.bdnews24));

    }
}
