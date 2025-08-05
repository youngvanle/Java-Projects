// Calculates wall area and paint needed with input validation

import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scnr = new Scanner(System.in);

        // Initialize variables
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        // Constant for paint coverage in square feet per gallon
        final double squareFeetPerGallons = 350.0;

        // Validate wall height input
        boolean validHeight = false;
        do {
            try {
                // Prompt user to enter wall height
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();

                // Check for valid height input
                if (wallHeight <= 0) {
                    System.out.println("Height must be greater than 0.");
                } else {
                    validHeight = true;
                }
            } catch (InputMismatchException e) {
                // Handle non-numeric input
                System.out.println("Please enter a numeric value.");
                scnr.next();
            }
        } while (!validHeight);

        // Validate wall width input
        boolean validWidth = false;
        do {
            try {
                // Prompt user to enter wall width
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();

                // Check for valid width input
                if (wallWidth <= 0) {
                    System.out.println("Width must be greater than 0.");
                } else {
                    validWidth = true;
                }
            } catch (InputMismatchException e) {
                // Handle non-numeric input
                System.out.println("Please enter a numeric value.");
                scnr.next();
            }
        } while (!validWidth);

        // Calculate wall area
        wallArea = wallHeight * wallWidth;

        // Output wall area
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate gallons of paint needed
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;

        // Output gallons of paint needed
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    }
}