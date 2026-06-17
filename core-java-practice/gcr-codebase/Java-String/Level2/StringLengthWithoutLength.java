import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (RuntimeException exception) {
                return count;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        int userDefinedLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + userDefinedLength);
        System.out.println("Length using built-in method: " + builtInLength);

        input.close();
    }
}
