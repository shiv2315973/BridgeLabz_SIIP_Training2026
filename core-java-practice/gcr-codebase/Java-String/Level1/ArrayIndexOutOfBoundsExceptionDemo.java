import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully.");
        } catch (RuntimeException exception) {
            System.out.println("RuntimeException handled successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException generated.");
        }

        handleArrayIndexOutOfBoundsException(names);
        input.close();
    }
}
