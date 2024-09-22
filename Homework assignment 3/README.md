# Vehicle Hierarchy and Engine Types - Homework 3

### Created by: Maede Eskandari Borujerdi  
### Matriculation Number: 7221435

---

## Project Overview

This project is the solution to **Hometask 3** for the **Object-Oriented Programming** course. In this assignment, we explore object hierarchies and inheritance through a Vehicle and Engine system. The code demonstrates how different types of vehicles (ICEV, BEV, HybridV) can be modeled using superclass-subclass relationships and how different engines (combustion, electric, hybrid) are integrated into those vehicle types.

By mixing abstract methods, arrays of objects, and some solid Java principles, we’ve built a small, functioning simulation of how vehicles and their characteristics can be modeled in code.

---

## Problem Breakdown and Solution Approach

### Task Summary
The task was divided into several steps:
1. Create a superclass **Engine** with subclasses **CombustionEngine**, **ElectricEngine**, and **HybridEngine**.
2. Build a class **Manufacture** representing vehicle manufacturers, complete with setters and getters.
3. Create an abstract superclass **Vehicle**, which would have subclasses: **ICEV** (Internal Combustion Engine Vehicle), **BEV** (Battery Electric Vehicle), and **HybridV** (Hybrid Vehicle).
4. Use arrays of the **Vehicle** type to hold various vehicle objects and demonstrate their characteristics using the **ShowCharacteristics()** method.
   
### How We Solved It

- **Vehicle Superclass:** We created an abstract `Vehicle` class with an abstract method `ShowCharacteristics()`. This method was overridden by each vehicle subclass to display information about the specific type of vehicle and its engine.
  
- **Engine Subclasses:** We built specialized subclasses of the **Engine** class, representing different engine types: **CombustionEngine**, **ElectricEngine**, and **HybridEngine**. These represent the power sources for the vehicles.
  
- **Manufacture Class:** A simple `Manufacture` class was created to hold details about the manufacturer of each vehicle. It includes fields like `name` and `country`, with proper setters and getters to access these attributes.

- **Array of Vehicles:** The vehicles were then stored in an array, and each one’s characteristics were displayed by calling the `ShowCharacteristics()` method.

---

## Development Environment

- **Language:** Java
- **IDE:** Eclipse IDE Version: 2024-06 (4.32.0)
- **Version Control:** Git (with this repo hosted on GitHub)

---

## How to Run the Program

1. **Clone the Repository:**  
   Clone the project from this GitHub repository using the following command:
   ```bash
   git clone https://github.com/Mdeskn/FH-Java.git
   ```
   
2. **Open the Project in Eclipse:**  
   Import the project into Eclipse as a Java project.

3. **Run the Main Class:**  
   The entry point of the program is in the `Main.java` file. Right-click on `Main.java` and select **Run As > Java Application**.

4. **View the Output:**  
   The console will display details about each vehicle, including its model, year, manufacturer, and engine type.

---