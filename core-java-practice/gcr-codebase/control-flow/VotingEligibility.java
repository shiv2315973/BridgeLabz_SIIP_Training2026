// Creating Class with name VotingEligibility to check if person can vote based on age
import java.util.Scanner;

class VotingEligibility {
    
    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input for age
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        // Check if person is eligible to vote (age >= 18)
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Close the Scanner Stream
        input.close();
    }
}