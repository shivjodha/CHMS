package com.example.droid.chms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.ContacLlistAdaper;
import Adapter.RoomHistoryAdapter;
import Adapter.RoomHistoryModel;

public class ContactList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<RoomHistoryModel> albumList;
    private ContacLlistAdaper adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);

        getSupportActionBar().setTitle("Guest House Contact List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_contact);

        albumList = new ArrayList<>();
        adapter = new ContacLlistAdaper(ContactList.this, albumList);

        /*RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);*/
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareAlbums();

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
