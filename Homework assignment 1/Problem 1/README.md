# Problem 1: Volume Calculation of Earth and Sun

**Author:** Maede Eskandari Borujerdi  
**Matriculation Number:** 7221435

## Project Overview

This Java application calculates the volume of the Earth and the Sun as spheres and determines the ratio of their volumes. The problem asks us to treat the Earth and Sun as perfect spheres and use the formula for the volume of a sphere:

```
V = (4 / 3) * π * r³
```

Where:
- `V` is the volume,
- `π` is the constant Pi (approximately 3.14159),
- `r` is the radius of the sphere.

### Problem Description

The diameter of the Sun is approximately **865,000 miles**, and the diameter of the Earth is approximately **7,600 miles**. Based on this, we need to:

1. Calculate the volume of the Earth in cubic miles.
2. Calculate the volume of the Sun in cubic miles.
3. Determine the ratio of the Sun’s volume to the Earth’s volume.

The output should display:
- The volume of the Earth,
- The volume of the Sun,
- The ratio of the Sun’s volume to the Earth’s volume.

The output will be similar to:
```
The volume of the Earth is X cubic miles.
The volume of the Sun is Y cubic miles.
The ratio of the volume of the Sun to the volume of the Earth is Z.
```

---

## Project Details

1. **Diameters**:  
   - Earth: 7,600 miles  
   - Sun: 865,000 miles  

   Radius is calculated as half of the diameter:
   ```java
   double earthRadius = earthDiameter / 2;
   double sunRadius = sunDiameter / 2;
   ```

2. **Volume Calculations**:  
   Using the sphere volume formula:
   ```java
   double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
   double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
   ```

3. **Ratio Calculation**:  
   ```java
   double volumeRatio = sunVolume / earthVolume;
   ```

4. **Output**:  
   ```java
   System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
   System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
   System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
   ```

---

## Instructions for Running the Project

### Step 1: Clone or Download the Project from GitHub

1. Visit the GitHub repository containing the project.
2. Download the project by clicking the **Code** button and selecting **Download ZIP**, or clone the repository using the following command:
   ```bash
   git clone https://github.com/Mdeskn/FH-Java.git
   ```
3. Extract the ZIP file to a folder on your local machine, or find the cloned project folder.

### Step 2: Import the Project into Eclipse

1. Open **Eclipse IDE**.
2. Go to **File > Import**.
3. Select **General > Existing Projects into Workspace** and click **Next**.
4. Click **Browse** and navigate to the folder where you saved or extracted the project, e.g.:
   ```bash
   C:\Users\<YourUsername>\FH-Java\Homework assignment 1\Problem 1
   ```
5. Select the project and click **Finish**.

### Step 3: Run the Program in Eclipse

1. In Eclipse, locate the imported project in the **Package Explorer**.
2. Right-click the project folder and choose **Run As > Java Application**.
3. The console will display the output with the volumes of the Earth and the Sun, as well as the ratio of the Sun's volume to the Earth's volume.