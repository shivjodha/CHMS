package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BindDropdownList {
    @SerializedName("BookingForList")
    @Expose
    private List<BookingForList> bookingForList = null;
    @SerializedName("GuestCategoryList")
    @Expose
    private List<GuestCategoryList> guestCategoryList = null;
    @SerializedName("GuestHouseList")
    @Expose
    private List<GuestHouseList> guestHouseList = null;
    @SerializedName("GuestTypeList")
    @Expose
    private Object guestTypeList;
    @SerializedName("StateList")
    @Expose
    private List<StateList> stateList = null;
    @SerializedName("PayMatrix")
    @Expose
    private List<PayMatrix> payMatrix = null;
    @SerializedName("TypeOfDocument")
    @Expose
    private List<TypeOfDocument> typeOfDocument = null;
    @SerializedName("PurposeOfTravel")
    @Expose
    private List<PurposeOfTravel> purposeOfTravel = null;
    @SerializedName("RelationWithGuest")
    @Expose
    private List<RelationWithGuest> relationWithGuest = null;
    @SerializedName("IDProofTypeName")
    @Expose
    private List<IDProofTypeName> iDProofTypeName = null;
    @SerializedName("GenderList")
    @Expose
    private List<GenderList> genderList = null;

    public List<BookingForList> getBookingForList() {
        return bookingForList;
    }

    public void setBookingForList(List<BookingForList> bookingForList) {
        this.bookingForList = bookingForList;
    }

    public List<GuestCategoryList> getGuestCategoryList() {
        return guestCategoryList;
    }

    public void setGuestCategoryList(List<GuestCategoryList> guestCategoryList) {
        this.guestCategoryList = guestCategoryList;
    }

    public List<GuestHouseList> getGuestHouseList() {
        return guestHouseList;
    }

    public void setGuestHouseList(List<GuestHouseList> guestHouseList) {
        this.guestHouseList = guestHouseList;
    }

    public Object getGuestTypeList() {
        return guestTypeList;
    }

    public void setGuestTypeList(Object guestTypeList) {
        this.guestTypeList = guestTypeList;
    }

    public List<StateList> getStateList() {
        return stateList;
    }

    public void setStateList(List<StateList> stateList) {
        this.stateList = stateList;
    }

    public List<PayMatrix> getPayMatrix() {
        return payMatrix;
    }

    public void setPayMatrix(List<PayMatrix> payMatrix) {
        this.payMatrix = payMatrix;
    }

    public List<TypeOfDocument> getTypeOfDocument() {
        return typeOfDocument;
    }

    public void setTypeOfDocument(List<TypeOfDocument> typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }

    public List<PurposeOfTravel> getPurposeOfTravel() {
        return purposeOfTravel;
    }

    public void setPurposeOfTravel(List<PurposeOfTravel> purposeOfTravel) {
        this.purposeOfTravel = purposeOfTravel;
    }

    public List<RelationWithGuest> getRelationWithGuest() {
        return relationWithGuest;
    }

    public void setRelationWithGuest(List<RelationWithGuest> relationWithGuest) {
        this.relationWithGuest = relationWithGuest;
    }

    public List<IDProofTypeName> getIDProofTypeName() {
        return iDProofTypeName;
    }

    public void setIDProofTypeName(List<IDProofTypeName> iDProofTypeName) {
        this.iDProofTypeName = iDProofTypeName;
    }

    public List<GenderList> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<GenderList> genderList) {
        this.genderList = genderList;
    }

}
