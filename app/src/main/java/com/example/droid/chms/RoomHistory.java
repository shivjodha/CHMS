package com.example.droid.chms;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;

import java.util.ArrayList;

import Adapter.RoomHistoryAdapter;
import Adapter.RoomHistoryModel;

public class RoomHistory extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<RoomHistoryModel> albumList;
    private RoomHistoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_history);



        getSupportActionBar().setTitle("Room Booking History");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new RoomHistoryAdapter(RoomHistory.this, albumList);

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


    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
