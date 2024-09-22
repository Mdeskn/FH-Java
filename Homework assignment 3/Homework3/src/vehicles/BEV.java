package vehicles;

// Subclass representing a Battery Electric Vehicle (BEV)
public class BEV extends Vehicle {

    // Constructor to initialize BEV details
    public BEV(String model, int year, Manufacture manufacture, Engine engine) {
        super(model, year, manufacture, engine);
    }

    // Overriding method to show characteristics of BEV
    @Override
    public void ShowCharacteristics() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufactured by: " + manufacture.getName() + " (" + manufacture.getCountry() + ")");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("-------------------------");
    }
}
