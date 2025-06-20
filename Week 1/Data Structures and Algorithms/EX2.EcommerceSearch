import java.util.*;

public class EcommerceSearch {

    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        public String toString() {
            return productId + " | " + productName + " | " + category;
        }
    }

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] productList = {
            new Product(101, "Mouse", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Shirt", "Clothing"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Monitor", "Electronics")
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name to search: ");
        String searchName = sc.nextLine();

        System.out.println("\nUsing Linear Search:");
        Product found1 = linearSearch(productList, searchName);
        System.out.println(found1 != null ? found1 : "Product not found.");

        Arrays.sort(productList, Comparator.comparing(p -> p.productName.toLowerCase()));
        System.out.println("\nUsing Binary Search:");
        Product found2 = binarySearch(productList, searchName);
        System.out.println(found2 != null ? found2 : "Product not found.");
    }
}
