// ParseStrings.java
// Prompts user for comma-separated strings, splits and outputs them

import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      // Create Scanner object for user input
      Scanner scnr = new Scanner(System.in);

      // Initialize input string
      String input = "";

      // Loop until user enters 'q' to quit
      while (!input.equals("q")) {
         // Prompt for input
         System.out.println("Enter input string: ");
         input = scnr.nextLine();

         // Check for quit condition
         if (input.equals("q")) {
            break;
         }

         // Check if input contains a comma
         if (!input.contains(",")) {
            System.out.println("Error: No comma in string");
            continue;
         }

         // Split input string at the first comma
         String[] parts = input.split(",", 2);

         // Trim both parts to remove any leading/trailing spaces
         String firstWord = parts[0].trim();
         String secondWord = parts[1].trim();

         // Output the results
         System.out.println("First word: " + firstWord);
         System.out.println("Second word: " + secondWord + "\n");

         // Extra newline for spacing between iterations
         System.out.println();
      }

      return;
   }
}