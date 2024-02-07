package src;

// Car class
public class Car {
    // Attributes
    private float maxSpeed;
    private String name;
    private int year;

    // Constructor
    public Car(float maxSpeed, String name, int year) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.year = year;
    }

    // Methods
    // Get the max speed of the car
    public float getMaxSpeed() {
        return maxSpeed;
    }

    // Set the max speed of the car
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Get the name of the car
    public String getName() {
        return name;
    }

    // Set the name of the car
    public void setName(String name) {
        this.name = name;
    }

    // Get the year of the car
    public int getYear() {
        return year;
    }

    // Set the year of the car
    public void setYear(int year) {
        this.year = year;
    }

    // Print the details of the car
    public void printDetails() {
        System.out.println("The car is " + name + ", made in " + year + ", and has a max speed of " + maxSpeed + " km/h.");
    }
}

