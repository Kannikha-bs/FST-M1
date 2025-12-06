package Activities_kanni;

public class Activity1 {

    public static void main(String[] args) {

        // Create an Object of Car
        Car myCar = new Car();

        // Initialize values
        myCar.make = 2014;
        myCar.color = "Black";
        myCar.transmission = "Manual";

        // Call methods
        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
    }
}
