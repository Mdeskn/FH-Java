package vehicles;

// Subclass representing a Hybrid Vehicle (HybridV)
public class HybridV extends Vehicle {

    // Constructor to initialize Hybrid Vehicle details
    public HybridV(String model, int year, Manufacture manufacture, Engine engine) {
        super(model, year, manufacture, engine);
    }

    // Overriding method to show characteristics of HybridV
    @Override
    public void ShowCharacteristics() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufactured by: " + manufacture.getName() + " (" + manufacture.getCountry() + ")");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("-------------------------");
    }
}
