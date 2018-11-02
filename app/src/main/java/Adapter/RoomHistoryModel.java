package Adapter;

public class RoomHistoryModel {
    private String name;
    private int numOfSongs;


    public RoomHistoryModel() {
    }

    public RoomHistoryModel(String name, int numOfSongs) {
        this.name = name;
        this.numOfSongs = numOfSongs;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }


}
