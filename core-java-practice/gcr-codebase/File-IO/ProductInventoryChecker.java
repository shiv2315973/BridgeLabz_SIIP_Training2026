import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductInventoryChecker {
    public static void main(String[] args) {
        String fileName = "inventory.txt";
        String searchProduct = "Laptop";
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String product = parts[0].trim();
                    int quantity = Integer.parseInt(parts[1].trim());
                    if (product.equalsIgnoreCase(searchProduct)) {
                        System.out.println(product + " is available with quantity " + quantity);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println(searchProduct + " is not available in inventory.");
            }
        } catch (IOException e) {
            System.out.println("Error reading inventory file: " + e.getMessage());
        }
    }
}
