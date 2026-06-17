import java.util.Scanner;

public class UppercaseComparison {
    public static String convertToUppercase(String text) {
        String uppercaseText = "";

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (character >= 'a' && character <= 'z') {
                uppercaseText += (char) (character - 32);
            } else {
                uppercaseText += character;
            }
        }

        return uppercaseText;
    }

    public static boolean compareUsingCharAt(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = input.nextLine();

        String userDefinedUppercase = convertToUppercase(text);
        String builtInUppercase = text.toUpperCase();
        boolean result = compareUsingCharAt(userDefinedUppercase, builtInUppercase);

        System.out.println("Uppercase using user-defined method: " + userDefinedUppercase);
        System.out.println("Uppercase using built-in method: " + builtInUppercase);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
