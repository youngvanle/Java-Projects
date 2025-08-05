// DrivingCost.java
// Calculates driving cost for different distances using a method

import java.util.Scanner;

public class LabProgram {

   // Method to calculate driving cost based on input values
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
      return (milesDriven / milesPerGallon) * dollarsPerGallon;
   }

   public static void main(String[] args) {
      // Create Scanner object for user input
      Scanner scnr = new Scanner(System.in);

      // Read miles per gallon and gas price from user
      double milesPerGallon = scnr.nextDouble();
      double dollarsPerGallon = scnr.nextDouble();

      // Call method to calculate and print driving cost for 10 miles
      System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10.0));

      // Call method to calculate and print driving cost for 50 miles
      System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50.0));

      // Call method to calculate and print driving cost for 400 miles
      System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400.0));
   }
}