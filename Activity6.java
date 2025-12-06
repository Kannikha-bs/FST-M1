package Activities_kanni;

public class Activity6 {

    public static void main(String[] args) {

        // Create plane object with maxPassengers = 10
        Plane plane = new Plane(10);

        // Add passengers
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

        // Print takeoff time
        System.out.println("Take-off time: " + plane.takeOff());

        // Print passengers
        System.out.println("Passengers on board: " + plane.getPassengers());

        // Simulate flight time
        try {
            Thread.sleep(5000); // pause for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane
        plane.land();

        // Print landing time
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}
