package citybike;
import java.util.ArrayList;

public class User {

    private static int IncrementUserId=1;
    private int userID;
    private String name;
    private String surname;
    private ArrayList<Bike> currentlyRentedBikes;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        currentlyRentedBikes=new ArrayList<>();
        this.userID=IncrementUserId++;
    }

    public void rentBike(Bike bike, Station station){
        if(station.getBikesInStation().contains(bike)) {
            currentlyRentedBikes.add(bike);
            station.getBikesInStation().remove(bike);

            System.out.println(this.name + " "+this.surname+ " is now renting bike ID "+bike.getBikeID()+ " from station "+ station.getLocation() );

        }
        else{
            System.out.println("Bike does not exist in this station");
        }
    }

    public void returnBike(Bike bike, Station station){

        if(currentlyRentedBikes.contains(bike)){

            boolean isSucess=station.addBike(bike);

            if (isSucess==true) {
                currentlyRentedBikes.remove(bike);
                System.out.println(this.name + " " + this.surname + " returned bike ID " + bike.getBikeID() + " to station " + station.getLocation());
            }
            else{

                System.out.println("User "+this.name+ " "+this.surname+" is trying to return bike in full station");
            }
        }
        else{
            System.out.println("Bike is not on my list of rented bikes !!");
        }
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Bike> getCurrentlyRentedBikes() {
        return currentlyRentedBikes;
    }

    public void setCurrentlyRentedBikes(ArrayList<Bike> currentlyRentedBikes) {
        this.currentlyRentedBikes = currentlyRentedBikes;
    }
}
