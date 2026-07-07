import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expense description: ");
        String description = sc.nextLine();
        System.out.print("Enter expense amount: ");
        double amount = sc.nextDouble();

        try (PrintWriter writer = new PrintWriter(new FileWriter("expenses.txt", true))) {
            writer.println(description + " - " + amount);
            System.out.println("Expense logged successfully.");
        } catch (IOException e) {
            System.out.println("Error logging expense: " + e.getMessage());
        }

        sc.close();
    }
}
