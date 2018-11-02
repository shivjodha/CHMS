package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.droid.chms.R;

import java.util.List;

public class PantryStatusAdapter extends RecyclerView.Adapter<PantryStatusAdapter.MyViewHolder> {

    private Context mContext;
    private List<RoomHistoryModel> roomhitoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;


        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tvRequestId);
            count = (TextView) view.findViewById(R.id.idRefrencenum);

        }
    }


    public PantryStatusAdapter(Context mContext, List<RoomHistoryModel> roomhitoryList) {
        this.mContext = mContext;
        this.roomhitoryList = roomhitoryList;
    }

    @Override
    public PantryStatusAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pantrystatuslist, parent, false);

        return new PantryStatusAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final PantryStatusAdapter.MyViewHolder holder, int position) {
        RoomHistoryModel album = roomhitoryList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs() + " songs");

        // loading album cover using Glide library

    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
   /* private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    *//**
     * Click listener for popup menu items
     *//*
    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Add to favourite", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_play_next:
                    Toast.makeText(mContext, "Play next", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }*/

    @Override
    public int getItemCount() {
        return roomhitoryList.size();
    }
}