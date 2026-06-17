import java.util.Scanner;

public class TrimStringUsingCharAt {
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

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

        System.out.print("Enter text with spaces: ");
        String text = input.nextLine();

        int[] indexes = findTrimIndexes(text);
        String userDefinedTrim = createSubstringUsingCharAt(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();
        boolean result = compareUsingCharAt(userDefinedTrim, builtInTrim);

        System.out.println("Trim using user-defined method: " + userDefinedTrim);
        System.out.println("Trim using built-in method: " + builtInTrim);
        System.out.println("Both results are same: " + result);

        input.close();
    }
}
