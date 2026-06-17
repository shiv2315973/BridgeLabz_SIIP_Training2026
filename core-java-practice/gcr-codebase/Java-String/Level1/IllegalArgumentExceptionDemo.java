import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void generateIllegalArgumentException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException handled successfully.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        try {
            generateIllegalArgumentException(text);
        } catch (IllegalArgumentException exception) {
            System.out.println("IllegalArgumentException generated.");
        }

        handleIllegalArgumentException(text);
        input.close();
    }
}
