package vehicles;

// Subclass representing an Internal Combustion Engine Vehicle (ICEV)
public class ICEV extends Vehicle {

    // Constructor to initialize ICEV details
    public ICEV(String model, int year, Manufacture manufacture, Engine engine) {
        super(model, year, manufacture, engine);
    }

    // Overriding method to show characteristics of ICEV
    @Override
    public void ShowCharacteristics() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufactured by: " + manufacture.getName() + " (" + manufacture.getCountry() + ")");
        System.out.println("Engine: " + engine.getEngineType());
        System.out.println("-------------------------");
    }
}
