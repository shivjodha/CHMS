package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PayMatrix {
    @SerializedName("Payer_ID")
    @Expose
    private String payerID;
    @SerializedName("Payer_Name")
    @Expose
    private String payerName;

    public String getPayerID() {
        return payerID;
    }

    public void setPayerID(String payerID) {
        this.payerID = payerID;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

}
