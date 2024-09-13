package problem1;

public class MathCalc {
    public static void main(String[] args) {
        // Step 1: Define the diameters of the Earth and Sun
        double earthDiameter = 7600.0;  // in miles
        double sunDiameter = 865000.0;  // in miles
        
        // Step 2: Calculate the radius (radius = diameter / 2)
        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;
        
        // Step 3: Use the volume formula: (4/3) * pi * r^3
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
        
        // Step 4: Calculate the ratio of the volume of the Sun to the Earth
        double volumeRatio = sunVolume / earthVolume;
        
        // Step 5: Output the results
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
    }
}


