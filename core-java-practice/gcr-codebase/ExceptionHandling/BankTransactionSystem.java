import java.util.Scanner;

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {
    public static void processTransaction(int amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Transaction amount must be positive.");
        }
        System.out.println("Transaction successful: " + amount + " processed.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter transaction amount: ");
        int amount = sc.nextInt();

        try {
            processTransaction(amount);
        } catch (InvalidTransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
