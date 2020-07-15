package ShoppingCart;

import java.util.Scanner;

public class ShopingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get item 1 details from user, create itemToPurchase object
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

        scnr.nextLine();
        System.out.println("");

        // Get item 2 details from user, create itemToPurchase object
        System.out.println("Item 2");

        System.out.println("Enter the item name: ");
        productName = scnr.nextLine();
        item2.setName(productName);

        System.out.println("Enter the item price: ");
        productPrice = scnr.nextInt();
        item2.setPrice(productPrice);

        System.out.println("Enter the item quantity: ");
        productQuantity = scnr.nextInt();
        item2.setQuantity(productQuantity);

        // Add costs of two items and print total
        // cartTotal = item one price + item two price
        // Totoal Cost
        System.out.println("");
        System.out.println("TOTAL COST");
        // item one information
        item1.printItemPurchase();
        // item two information
        item2.printItemPurchase();
        // Total output
        System.out.println("");
        cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
        System.out.println("Total: $" + cartTotal);
        return;
    }
}
