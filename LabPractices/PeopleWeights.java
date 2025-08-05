// PeopleWeights.java
// Prompts user to enter five weights and calculates total, average, and max

import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      // Create Scanner object for user input
      Scanner scnr = new Scanner(System.in);

      // Constant for number of people
      final int NUM_PEOPLE = 5;

      // Array to store weights
      double[] weights = new double[NUM_PEOPLE];

      // Initialize totals and max value
      double totalWeight = 0.0;
      double maxWeight = 0.0;
      double averageWeight;

      // Prompt user to enter each weight
      for (int i = 0; i < NUM_PEOPLE; ++i) {
         System.out.println("Enter weight " + (i + 1) + ": ");
         weights[i] = scnr.nextDouble();
      }

      // Output entered weights in one line
      System.out.print("\nYou entered: ");
      for (int i = 0; i < NUM_PEOPLE; ++i) {
         System.out.print(weights[i] + " ");
      }
      System.out.println();

      // Calculate total weight
      for (int i = 0; i < NUM_PEOPLE; ++i) {
         totalWeight += weights[i];
      }

      // Calculate average weight
      averageWeight = totalWeight / NUM_PEOPLE;

      // Determine max weight in array
      maxWeight = weights[0];
      for (int i = 1; i < NUM_PEOPLE; ++i) {
         if (weights[i] > maxWeight) {
            maxWeight = weights[i];
         }
      }

      // Output final results
      System.out.println("Total weight: " + totalWeight);
      System.out.println("Average weight: " + averageWeight);
      System.out.println("Max weight: " + maxWeight);

      return;
   }
}