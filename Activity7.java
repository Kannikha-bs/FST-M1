package Activities_kanni;

public class Activity7 {

    public static void main(String[] args) {

        // Create MountainBike object
        MountainBike mb = new MountainBike(5, 20, 10);

        // Access methods & variables
        mb.bicycleDesc();
        
        mb.speedUp(5);
        mb.applyBrake(3);

        mb.setHeight(15);
        mb.bicycleDesc();
    }
}
