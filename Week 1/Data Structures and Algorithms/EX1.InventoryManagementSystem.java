import java.util.*;

public class InventoryManagementSystem {

    static class Product {
        int productId;
        String productName;
        int quantity;
        double price;

        Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public String toString() {
            return productId + " | " + productName + " | Qty: " + quantity + " | Price: ₹" + price;
        }
    }

    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void addProduct(Scanner sc) {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        inventory.put(id, new Product(id, name, qty, price));
        System.out.println("Product added.");
    }

    public static void updateProduct(Scanner sc) {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        if (inventory.containsKey(id)) {
            System.out.print("Enter New Quantity: ");
            int qty = sc.nextInt();
            System.out.print("Enter New Price: ");
            double price = sc.nextDouble();
            Product p = inventory.get(id);
            p.quantity = qty;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void deleteProduct(Scanner sc) {
        System.out.print("Enter Product ID to delete: ");
        int id = sc.nextInt();
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Display Inventory\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: addProduct(sc); break;
                case 2: updateProduct(sc); break;
                case 3: deleteProduct(sc); break;
                case 4: displayInventory(); break;
                case 5: System.out.println("Exiting."); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
