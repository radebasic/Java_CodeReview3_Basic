package citybike;
import java.util.ArrayList;

public class Station {
    private static int IncrementStationId=1;
    private int stationID;
    private String location;
    private ArrayList<Bike> bikesInStation;
    private int upperLimit;

    public Station(String location, int upperLimit) {
        this.stationID = IncrementStationId++;
        this.location = location;
        bikesInStation=new ArrayList<>();
        this.upperLimit=upperLimit;
    }

    public boolean addBike(Bike bike){

        if(bikesInStation.size()>=upperLimit){
            return false;
        }

        bikesInStation.add(bike);
        return true;
    }

    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Bike> getBikesInStation() {
        return bikesInStation;
    }

    public void setBikesInStation(ArrayList<Bike> bikesInStation) {
        this.bikesInStation = bikesInStation;
    }
}
