package com.example.droid.chms;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;

import Adapter.BookingGuestlistAdapter;
import Adapter.ContacLlistAdaper;
import Adapter.RoomHistoryModel;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Atishay on 20-09-2018.
 */

public class Bokking_Guestdetails extends AppCompatActivity {

    @BindView(R.id.btnext)
    Button next_btn;
    RecyclerView recyclerView;
    private ArrayList<RoomHistoryModel> albumList;
    private BookingGuestlistAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bokking_guestdetails);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Additional Guest List");
        Hawk.init(this).build();
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Bokking_Guestdetails.this, Bookingrequest_Fifth.class);
                startActivity(intent);
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_contact);

         albumList = new ArrayList<>();
         albumList= Hawk.get("aditionalguest");
        adapter = new BookingGuestlistAdapter(Bokking_Guestdetails.this, albumList);

        /*RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);*/
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
      //  prepareAlbums();

    }


    private void prepareAlbums() {


        RoomHistoryModel a = new RoomHistoryModel("True", 13);
        albumList.add(a);

        a = new RoomHistoryModel("Xscpae", 8);
        albumList.add(a);

        a = new RoomHistoryModel("Maroon 5", 11);
        albumList.add(a);

        a = new RoomHistoryModel("Born to Die", 12);
        albumList.add(a);

        a = new RoomHistoryModel("new", 14);
        albumList.add(a);

        a = new RoomHistoryModel("I Need a Doctor", 1);
        albumList.add(a);

        a = new RoomHistoryModel("Loud", 11);
        albumList.add(a);

        a = new RoomHistoryModel("Legend", 14);
        albumList.add(a);

        a = new RoomHistoryModel("Hello", 11);
        albumList.add(a);

        a = new RoomHistoryModel("Greatest Hits", 17);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }
}
