# Hometask 2 - Car Assignment

**Name:** Maede Eskandari Borujerdi  
**Matriculation Number:** 7221435  

## Problem Overview
The task involves creating a `Car` class with attributes like id, make, model, year of manufacture, color, price, and registration number. The challenge is to work with an array of `Car` objects and filter the cars based on specific conditions, saving the results to different files.

### Problem Breakdown:
1. **List of cars by a given brand.**
2. **List of cars by a given model that have been in use for more than a specified number of years.**
3. **List of cars from a given year of manufacture, where the price is higher than a specified amount.**

## Solution Overview
The solution involves creating a **Java project** that:
- Defines the `Car` class.
- Populates an array of `Car` objects.
- Implements methods to filter and save the car lists to files based on the given conditions.

### Key Concepts Used:
1. **Object-Oriented Programming (OOP):**  
   The `Car` class is designed to model real-world cars with properties like make, model, year, price, and registration number. We encapsulate these details within a class, allowing us to create multiple car objects and manipulate them easily.
   
2. **ArrayList and Iteration:**  
   We use an `ArrayList<Car>` to store multiple car objects, and then we loop through this list to filter cars based on the conditions. This dynamic data structure allows flexible and efficient storage and retrieval.

3. **File I/O:**  
   To meet the requirement of saving the filtered lists to different files, we use Java's `FileWriter` to write output to text files. Each method in the program writes the filtered results into a corresponding file.

4. **Condition-based Filtering:**  
   - **Cars by Brand:** We use a simple string comparison to match the car's make with the specified brand.
   - **Cars by Model and Age:** We calculate the car's age by subtracting the manufacturing year from the current year and check if it exceeds the specified threshold.
   - **Cars by Year and Price:** We check if the car's manufacturing year matches the given year and whether its price exceeds the specified value.

5. **Bubble Sort:**  
   Although sorting was not explicitly required for this problem, the method for filtering and saving lists could be adapted for sorting in future tasks.

## Solution Structure
The solution consists of two main files:

### 1. Car.java
This file contains the `Car` class, which has the following attributes:
- `id`: An integer representing the unique ID of the car.
- `make`: The manufacturer of the car (e.g., Toyota, Honda).
- `model`: The specific model of the car (e.g., Civic, Corolla).
- `year`: The year the car was manufactured.
- `color`: The color of the car.
- `price`: The price of the car.
- `registrationNumber`: The registration number of the car.

The class also includes getter methods and a `toString()` method for formatting the car's details as a string.

### 2. CarApp.java
This is the main driver class containing the logic to:
- Create an array of `Car` objects.
- Call methods that filter cars by make, model, age, year, and price.
- Save the filtered lists to text files.

#### Methods in CarApp.java:
- `saveCarsByMake()`: Filters cars by their make (brand) and saves the result to `CarsByMake.txt`.
- `saveCarsByModelAndAge()`: Filters cars by their model and age and saves the result to `CarsByModelAndAge.txt`.
- `saveCarsByYearAndPrice()`: Filters cars by their year of manufacture and price and saves the result to `CarsByYearAndPrice.txt`.

### Example Output Files:
- `CarsByMake.txt`: Contains the list of cars matching the specified brand.
- `CarsByModelAndAge.txt`: Contains cars of a specific model that have been used for more than `n` years.
- `CarsByYearAndPrice.txt`: Contains cars from a given year with prices above the specified threshold.

## How to Run the Solution
1. **Development Environment:**
   - IDE: Eclipse IDE for Java Developers (Version: 2024-06)

2. **Steps to Run:**
   - Clone or download the project repository from GitHub.
   - Import the project into Eclipse by selecting **File > Import > Existing Projects into Workspace**.
   - Run the `CarApp.java` file by right-clicking it in the Project Explorer and selecting **Run As > Java Application**.
   - The program will create three text files in the project directory, each containing the filtered car lists based on the given criteria.
