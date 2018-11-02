package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestCategoryList {
    @SerializedName("GuestCategoryID")
    @Expose
    private String guestCategoryID;
    @SerializedName("GuestCategoryName")
    @Expose
    private String guestCategoryName;

    public String getGuestCategoryID() {
        return guestCategoryID;
    }

    public void setGuestCategoryID(String guestCategoryID) {
        this.guestCategoryID = guestCategoryID;
    }

    public String getGuestCategoryName() {
        return guestCategoryName;
    }

    public void setGuestCategoryName(String guestCategoryName) {
        this.guestCategoryName = guestCategoryName;
    }

}
