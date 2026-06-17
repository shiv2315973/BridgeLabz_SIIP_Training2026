import java.util.Scanner;

public class CharacterTypeTable {
    public static String checkCharacter(char character) {
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        if (character >= 'a' && character <= 'z') {
            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }

        return "Not a Letter";
    }

    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }

        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[][] characterTypes = findCharacterTypes(text);
        displayTable(characterTypes);

        input.close();
    }
}
