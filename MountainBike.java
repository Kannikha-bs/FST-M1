package Activities_kanni;

public class MountainBike extends Bicycle {

    public int seatHeight;

    // Constructor using super
    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newHeight) {
        seatHeight = newHeight;
        System.out.println("Seat height set to: " + seatHeight);
    }

    // Override method
    @Override
    public void bicycleDesc() {
        super.bicycleDesc();
        System.out.println("Seat height: " + seatHeight);
    }
}
