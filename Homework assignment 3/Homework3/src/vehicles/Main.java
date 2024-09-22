package vehicles;

// Main class to test and demonstrate the vehicles
public class Main {
    public static void main(String[] args) {
        // Creating manufacturer objects
        Manufacture toyota = new Manufacture("Toyota", "Japan");
        Manufacture tesla = new Manufacture("Tesla", "USA");

        // Creating vehicle objects and assigning the correct engines
        Vehicle car1 = new ICEV("Corolla", 2010, toyota, new CombustionEngine());
        Vehicle car2 = new BEV("Model S", 2020, tesla, new ElectricEngine());
        Vehicle car3 = new HybridV("Prius", 2015, toyota, new HybridEngine());

        // Displaying characteristics of each vehicle
        car1.ShowCharacteristics();
        car2.ShowCharacteristics();
        car3.ShowCharacteristics();
    }
}
