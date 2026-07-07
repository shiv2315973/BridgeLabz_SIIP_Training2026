import java.util.Scanner;

public class PalindromeRecursion {
    public static boolean isPalindrome(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindrome(text, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println("Is palindrome? " + result);
        sc.close();
    }
}
