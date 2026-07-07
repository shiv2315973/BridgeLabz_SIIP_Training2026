import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordStrengthChecker {
    public static void checkPassword(String password) throws WeakPasswordException {
        if (password.length() < 8) {
            throw new WeakPasswordException("Password must be at least 8 characters long.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new WeakPasswordException("Password must contain an uppercase letter.");
        }
        if (!password.matches(".*[0-9].*")) {
            throw new WeakPasswordException("Password must contain a digit.");
        }
        System.out.println("Password is strong enough.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            checkPassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("Weak password: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
