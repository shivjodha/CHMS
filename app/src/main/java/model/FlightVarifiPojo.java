package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightVarifiPojo {
    @SerializedName("BindDropdownList")
    @Expose
    private BindDropdownList bindDropdownList;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Reason")
    @Expose
    private String reason;

    public BindDropdownList getBindDropdownList() {
        return bindDropdownList;
    }

    public void setBindDropdownList(BindDropdownList bindDropdownList) {
        this.bindDropdownList = bindDropdownList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
