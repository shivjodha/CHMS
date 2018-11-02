package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StateList {
    @SerializedName("StateID")
    @Expose
    private String stateID;
    @SerializedName("StateName")
    @Expose
    private String stateName;

    public String getStateID() {
        return stateID;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}
