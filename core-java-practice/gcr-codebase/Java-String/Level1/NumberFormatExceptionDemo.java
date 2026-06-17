import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number is " + number);
    }

    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is " + number);
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException handled successfully.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.next();

        try {
            generateNumberFormatException(text);
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException generated.");
        }

        handleNumberFormatException(text);
        input.close();
    }
}
