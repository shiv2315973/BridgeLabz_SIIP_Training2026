import java.util.Scanner;

public class LowercaseComparison {
    public static String convertToLowercase(String text) {
        String lowercaseText = "";

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                lowercaseText += (char) (character + 32);
            } else {
                lowercaseText += character;
            }
        }

        return lowercaseText;
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

        String userDefinedLowercase = convertToLowercase(text);
        String builtInLowercase = text.toLowerCase();
        boolean result = compareUsingCharAt(userDefinedLowercase, builtInLowercase);

        System.out.println("Lowercase using user-defined method: " + userDefinedLowercase);
        System.out.println("Lowercase using built-in method: " + builtInLowercase);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
