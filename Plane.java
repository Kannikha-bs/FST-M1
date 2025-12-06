package Activities_kanni;

import java.util.ArrayList;
import java.util.Date;

public class Plane {

    // Private variables (Encapsulation)
    private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeLanded;
    private Date lastTimeTakenOff;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Add passenger
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Plane is full! Cannot onboard " + passenger);
        }
    }

    // Take off — returns current date & time
    public Date takeOff() {
        lastTimeTakenOff = new Date();
        return lastTimeTakenOff;
    }

    // Land — updates landing time and clears passengers list
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    // Getter for last landing time
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    // Getter for passengers
    public ArrayList<String> getPassengers() {
        return passengers;
    }
}
