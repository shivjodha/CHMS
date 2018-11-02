package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestHouseList {
    @SerializedName("GuestHouseID")
    @Expose
    private String guestHouseID;
    @SerializedName("GuesthouseName")
    @Expose
    private String guesthouseName;

    public String getGuestHouseID() {
        return guestHouseID;
    }

    public void setGuestHouseID(String guestHouseID) {
        this.guestHouseID = guestHouseID;
    }

    public String getGuesthouseName() {
        return guesthouseName;
    }

    public void setGuesthouseName(String guesthouseName) {
        this.guesthouseName = guesthouseName;
    }

}
