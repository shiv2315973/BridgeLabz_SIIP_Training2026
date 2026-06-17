import java.util.Scanner;

public class UniqueCharacters {
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

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueCharacters = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCharacters[uniqueIndex] = text.charAt(i);
                uniqueIndex++;
            }
        }

        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueCharacters[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);

        System.out.println("Unique characters are:");
        for (int i = 0; i < uniqueCharacters.length; i++) {
            System.out.println(uniqueCharacters[i]);
        }

        input.close();
    }
}
