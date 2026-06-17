import java.util.Scanner;

public class StringComparison {
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

        System.out.print("Enter first string: ");
        String text1 = input.next();

        System.out.print("Enter second string: ");
        String text2 = input.next();

        boolean charAtResult = compareUsingCharAt(text1, text2);
        boolean equalsResult = text1.equals(text2);

        System.out.println("Result using charAt method: " + charAtResult);
        System.out.println("Result using equals method: " + equalsResult);
        System.out.println("Both results are same: " + (charAtResult == equalsResult));

        input.close();
    }
}
