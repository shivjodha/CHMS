package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.droid.chms.R;

import java.util.List;

public class RoomHistoryAdapter extends RecyclerView.Adapter<RoomHistoryAdapter.MyViewHolder> {


    private Context mContext;
    private List<RoomHistoryModel> roomhitoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView requestid, purpose,fullname,status,arrivaldate,departureDate,fuesttype,requesteddate,cansel,print;


        public MyViewHolder(View view) {
            super(view);
            fullname = (TextView) view.findViewById(R.id.tvFullName);
            requestid = (TextView) view.findViewById(R.id.tvRequestId);
            purpose = (TextView) view.findViewById(R.id.tvPurpose);
            status = (TextView)view.findViewById(R.id.tvStatus);
            arrivaldate = (TextView)view.findViewById(R.id.tvArrivalDate);
            departureDate = (TextView)view.findViewById(R.id.tvDepartureDate);
            fuesttype = (TextView)view.findViewById(R.id.tvGuestType);
            requesteddate = (TextView)view.findViewById(R.id.tvRequestedDate);
            cansel = (TextView)view.findViewById(R.id.btcansel);
            print = (TextView)view.findViewById(R.id.idprint);
        }
    }


    public RoomHistoryAdapter(Context mContext, List<RoomHistoryModel> roomhitoryList) {
        this.mContext = mContext;
        this.roomhitoryList = roomhitoryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.roomhistoryview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        RoomHistoryModel album = roomhitoryList.get(position);
        holder.requestid.setText(album.getName());
        holder.purpose.setText(album.getNumOfSongs() + " songs");

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
