package carapp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarApp {

    public static void main(String[] args) {
        // Step 1: Create a list of Car objects
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Corolla", 2010, "Red", 5000, "ABC123"));
        cars.add(new Car(2, "Honda", "Civic", 2015, "Blue", 12000, "DEF456"));
        cars.add(new Car(3, "Ford", "Fiesta", 2008, "White", 3000, "GHI789"));
        cars.add(new Car(4, "Toyota", "Camry", 2012, "Black", 8000, "JKL012"));
        cars.add(new Car(5, "Honda", "Accord", 2011, "Silver", 9500, "MNO345"));

        // Step 2: Save a list of cars of a given brand to a file
        saveCarsByMake(cars, "Toyota");

        // Step 3: Save a list of cars of a given model that are older than a certain number of years
        saveCarsByModelAndAge(cars, "Civic", 5);

        // Step 4: Save a list of cars from a certain year that are above a certain price
        saveCarsByYearAndPrice(cars, 2011, 7000);
    }

    // Method to save cars of a specific make to a file
    public static void saveCarsByMake(List<Car> cars, String make) {
        try (FileWriter writer = new FileWriter("CarsByMake.txt")) {
            for (Car car : cars) {
                if (car.getMake().equalsIgnoreCase(make)) {
                    writer.write(car.toString() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to save cars of a specific model that are older than n years
    public static void saveCarsByModelAndAge(List<Car> cars, String model, int years) {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        try (FileWriter writer = new FileWriter("CarsByModelAndAge.txt")) {
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(model) && currentYear - car.getYear() > years) {
                    writer.write(car.toString() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to save cars from a given year that have a price higher than the specified value
    public static void saveCarsByYearAndPrice(List<Car> cars, int year, double price) {
        try (FileWriter writer = new FileWriter("CarsByYearAndPrice.txt")) {
            for (Car car : cars) {
                if (car.getYear() == year && car.getPrice() > price) {
                    writer.write(car.toString() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
