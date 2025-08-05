// Calculates wall area, paint needed, and number of cans required

import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scnr = new Scanner(System.in);

        // Initialize variables for dimensions and paint calculations
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded = 0.0;

        // Constants for paint coverage and can size
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();

        // Prompt user to input wall width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculate wall area
        wallArea = wallHeight * wallWidth;

        // Output wall area
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate gallons of paint needed
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;

        // Output gallons of paint needed
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate number of cans needed (rounded up to nearest whole number)
        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);

        // Output number of cans needed
        System.out.println("Cans needed: " + cansNeeded + " can(s)");

        // Close Scanner
        scnr.close();
    }
}