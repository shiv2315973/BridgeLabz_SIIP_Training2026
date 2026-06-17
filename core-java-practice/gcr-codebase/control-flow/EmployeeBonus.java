// Creating Class with name EmployeeBonus to find bonus based on years of service
import java.util.Scanner;

class EmployeeBonus {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get salary input
        System.out.println("Enter the salary: ");
        double salary = input.nextDouble();
        
        // Get years of service input
        System.out.println("Enter the years of service: ");
        int yearsOfService = input.nextInt();
        
        // Define bonus percentage
        final double BONUS_PERCENTAGE = 5.0;
        
        // Check if years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate bonus as 5% of salary
            double bonusAmount = salary * BONUS_PERCENTAGE / 100;
            System.out.println("Years of service: " + yearsOfService);
            System.out.println("Salary: " + salary);
            System.out.println("Bonus percentage: " + BONUS_PERCENTAGE + "%");
            System.out.println("Bonus amount: " + bonusAmount);
        } else {
            System.out.println("Employee with " + yearsOfService + " years of service is not eligible for bonus");
        }
        
        // Close the Scanner Stream
        input.close();
    }
}