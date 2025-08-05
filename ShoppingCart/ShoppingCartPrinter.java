// ShoppingCartPrinter.java
// Prompts user for two items, calculates and prints total cost

import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      // Create Scanner object for input
      Scanner scnr = new Scanner(System.in);

      // Initialize variables
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;

      // Create two ItemToPurchase objects
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user input
      System.out.println("Item 1");

      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      item1.setName(productName);

      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      item1.setPrice(productPrice);

      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      item1.setQuantity(productQuantity);

      // Consume newline before reading next item's name
      scnr.nextLine();

      // Get item 2 details from user input
      System.out.println("\nItem 2");

      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      item2.setName(productName);

      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      item2.setPrice(productPrice);

      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      item2.setQuantity(productQuantity);
      
      // Calculate total cost of both items
      cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

      // Output total cost breakdown
      System.out.println("\nTOTAL COST");
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice()
                         + " = $" + (item1.getPrice() * item1.getQuantity()));
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice()
                         + " = $" + (item2.getPrice() * item2.getQuantity()));
      System.out.println("\nTotal: $" + cartTotal);

      return;
   }
}