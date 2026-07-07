import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GroceryBillReader {
    public static void main(String[] args) {
        String fileName = "grocery_bill.txt";
        double total = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String item = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    System.out.println(item + ": " + price);
                    total += price;
                }
            }
            System.out.println("Total bill amount: " + total);
        } catch (IOException e) {
            System.out.println("Error reading bill file: " + e.getMessage());
        }
    }
}
