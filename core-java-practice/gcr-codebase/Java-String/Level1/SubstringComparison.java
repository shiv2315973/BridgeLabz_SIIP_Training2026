import java.util.Scanner;

public class SubstringComparison {
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String substring = "";

        for (int i = start; i < end; i++) {
            substring += text.charAt(i);
        }

        return substring;
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

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        String charAtSubstring = createSubstringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);
        boolean result = compareUsingCharAt(charAtSubstring, builtInSubstring);

        System.out.println("Substring using charAt method: " + charAtSubstring);
        System.out.println("Substring using built-in substring method: " + builtInSubstring);
        System.out.println("Both substrings are same: " + result);

        input.close();
    }
}
