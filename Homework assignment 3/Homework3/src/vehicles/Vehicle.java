package vehicles;

// Abstract superclass representing a Vehicle
public abstract class Vehicle {
    protected String model;  // Model of the vehicle
    protected int year;  // Year of manufacture
    protected Manufacture manufacture;  // Manufacture object
    protected Engine engine;  // Engine object

    // Constructor to initialize vehicle details
    public Vehicle(String model, int year, Manufacture manufacture, Engine engine) {
        this.model = model;
        this.year = year;
        this.manufacture = manufacture;
        this.engine = engine;
    }

    // Abstract method to display vehicle characteristics
    public abstract void ShowCharacteristics();
}
