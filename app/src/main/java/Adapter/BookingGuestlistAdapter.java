package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.droid.chms.R;

import java.util.List;

/**
 * Created by Atishay on 20-09-2018.
 */

public class BookingGuestlistAdapter extends RecyclerView.Adapter<BookingGuestlistAdapter.MyViewHolder> {

    private Context mContext;
    private List<RoomHistoryModel> roomhitoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;


        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tvRequestId);
            count = (TextView) view.findViewById(R.id.tvArrivalDate);

        }
    }


    public BookingGuestlistAdapter(Context mContext, List<RoomHistoryModel> roomhitoryList) {
        this.mContext = mContext;
        this.roomhitoryList = roomhitoryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bookingguestlist_cell, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        RoomHistoryModel album = roomhitoryList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs() + " songs");

    }


    @Override
    public int getItemCount() {
        return roomhitoryList.size();
    }
}

