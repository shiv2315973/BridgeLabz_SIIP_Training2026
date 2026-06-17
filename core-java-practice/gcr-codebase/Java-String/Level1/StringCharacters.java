import java.util.Scanner;

public class StringCharacters {
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        char[] userDefinedCharacters = getCharacters(text);
        char[] builtInCharacters = text.toCharArray();
        boolean result = compareCharArrays(userDefinedCharacters, builtInCharacters);

        System.out.println("Characters using user-defined method:");
        for (int i = 0; i < userDefinedCharacters.length; i++) {
            System.out.println(userDefinedCharacters[i]);
        }

        System.out.println("Characters using built-in toCharArray method:");
        for (int i = 0; i < builtInCharacters.length; i++) {
            System.out.println(builtInCharacters[i]);
        }

        System.out.println("Both character arrays are same: " + result);

        input.close();
    }
}
