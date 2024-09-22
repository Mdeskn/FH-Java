package vehicles;

// Class to store manufacturer information for vehicles
public class Manufacture {
    private String name;  // Name of the manufacturer
    private String country;  // Country of the manufacturer

    // Constructor to initialize manufacturer details
    public Manufacture(String name, String country) {
        this.name = name;
        this.country = country;
    }

    // Getter for manufacturer name
    public String getName() {
        return name;
    }

    // Getter for manufacturer country
    public String getCountry() {
        return country;
    }
}
