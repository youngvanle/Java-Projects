// ItemToPurchase.java
// Class to store item name, price, quantity, and print purchase info

public class ItemToPurchase {
   // Private fields - itemName, itemPrice, and itemQuantity
   private String itemName;
   private int itemPrice;
   private int itemQuantity;

   // Default constructor initializes fields to default values
   public ItemToPurchase() {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
   }
    
   // Set the item name
   public void setName(String name) {
      itemName = name;
   }

   // Set the item price
   public void setPrice(int price) {
      itemPrice = price;
   }

   // Set the item quantity
   public void setQuantity(int quantity) {
      itemQuantity = quantity;
   }

   // Get the item name
   public String getName() {
      return itemName;
   }

   // Get the item price
   public int getPrice() {
      return itemPrice;
   }

   // Get the item quantity
   public int getQuantity() {
      return itemQuantity;
   }
   
   // Print item purchase summary
   public void printItemPurchase() {
      System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
   }
}