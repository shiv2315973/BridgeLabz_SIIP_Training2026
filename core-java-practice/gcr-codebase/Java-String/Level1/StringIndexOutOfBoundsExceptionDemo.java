import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void generateStringIndexOutOfBoundsException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        try {
            generateStringIndexOutOfBoundsException(text);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("StringIndexOutOfBoundsException generated.");
        }

        handleStringIndexOutOfBoundsException(text);

        input.close();
    }
}
