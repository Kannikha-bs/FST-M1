package Activities_kanni;

public class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int currentSpeed;

    // Constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    // Reduce speed
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed after applying brake: " + currentSpeed);
    }

    // Increase speed
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed after speeding up: " + currentSpeed);
    }

    // Description
    public void bicycleDesc() {
        System.out.println("Number of gears: " + gears);
        System.out.println("Max speed: " + maxSpeed);
    }
}
