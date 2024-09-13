package problem1;

public class MathCalc {
    public static void main(String[] args) {
        // First we have to define the diameters of the Earth and Sun
        double earthDiameter = 7600.0;
        double sunDiameter = 865000.0;
        
        // then we need to calculate the radius (radius = diameter / 2)
        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;
        
        // then we have to use the volume formula: (4/3) * pi * r^3
        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
        
        // and then calculate the ratio of the volume of the Sun to the Earth
        double volumeRatio = sunVolume / earthVolume;
        
        // the last step is to output the results
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
    }
}


