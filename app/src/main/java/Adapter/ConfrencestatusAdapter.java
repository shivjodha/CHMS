package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.droid.chms.R;

import java.util.List;

public class ConfrencestatusAdapter extends RecyclerView.Adapter<ConfrencestatusAdapter.MyViewHolder> {

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


    public ConfrencestatusAdapter(Context mContext, List<RoomHistoryModel> roomhitoryList) {
        this.mContext = mContext;
        this.roomhitoryList = roomhitoryList;
    }

    @Override
    public ConfrencestatusAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.confrencelist, parent, false);

        return new ConfrencestatusAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ConfrencestatusAdapter.MyViewHolder holder, int position) {
        RoomHistoryModel album = roomhitoryList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs() + " songs");

        // loading album cover using Glide library

    }


    @Override
    public int getItemCount() {
        return roomhitoryList.size();
    }
}
