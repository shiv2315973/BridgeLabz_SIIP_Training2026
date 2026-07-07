import java.util.Scanner;

public class ReverseStringRecursion {
    public static String reverse(String text) {
        if (text.isEmpty()) {
            return text;
        }
        return reverse(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        System.out.println("Reversed string: " + reverse(input));
        sc.close();
    }
}
