package citybike;
import java.util.HashMap;

public class TestApp {
    public static void main(String[] args) {
        Bike bike1 = new Bike("blue");
        Bike bike2 = new Bike("red");
        Bike bike3 = new Bike("green");
        Bike bike4 = new Bike("black");
        Bike bike5 = new Bike("yellow");
        Bike bike6 = new Bike("violet");
        Bike bike7 = new Bike("orange");
        Bike bike8 = new Bike("white");

        System.out.println(bike1.getBikeID());
        System.out.println(bike2.getBikeID());

        HashMap<Integer,Bike> myHahMap=new HashMap<>();
        myHahMap.put(bike1.getBikeID(),bike1);
        myHahMap.put(bike2.getBikeID(),bike2);
        myHahMap.put(bike3.getBikeID(),bike3);
        myHahMap.put(bike4.getBikeID(),bike4);
        myHahMap.put(bike5.getBikeID(),bike5);
        myHahMap.put(bike6.getBikeID(),bike6);
        myHahMap.put(bike7.getBikeID(),bike7);
        myHahMap.put(bike8.getBikeID(),bike8);

        Station station1=new Station("Florisdorf",4);
        Station station2=new Station("Center",5);
        Station station3= new Station("Ottakring",4);

        station1.addBike(bike1);
        station1.addBike(bike2);
        station1.addBike(bike3);
        station2.addBike(bike4);
        station2.addBike(bike5);
        station2.addBike(bike6);
        station2.addBike(bike7);

        HashMap<Integer, Station> myHashMapStation=new HashMap<>();
        myHashMapStation.put(station1.getStationID(),station1);
        myHashMapStation.put(station2.getStationID(),station2);
        myHashMapStation.put(station3.getStationID(),station3);

        User user1=new User("John", "Miller");
        User user2=new User("David","David");
        User user3=new User("Stefan","David");
        User user4=new User("Mike","Spencer");

        user1.rentBike(bike6,station2);
        user1.returnBike(bike6,station1);
        user1.rentBike(bike7,station2);
        user2.rentBike(bike1,station1);
        user2.returnBike(bike1,station1);
        user1.returnBike(bike7,station1);
    }
}
