// Main class
public class Main {
    public static void main(String[] args) {
        // Create a car object
        Car car1 = new Car(200, "Toyota", 2020);

        // Run the methods
        car1.printDetails();
        car1.setMaxSpeed(220); // Change the max speed
        car1.printDetails();
    }
}
