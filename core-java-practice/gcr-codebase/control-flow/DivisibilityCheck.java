// Creating Class with name DivisibilityCheck to check if a number is divisible by 5
import java.util.Scanner;

class DivisibilityCheck {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for number
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? true");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? false");
        }
        
        // Close the Scanner Stream
        input.close();
    }
}