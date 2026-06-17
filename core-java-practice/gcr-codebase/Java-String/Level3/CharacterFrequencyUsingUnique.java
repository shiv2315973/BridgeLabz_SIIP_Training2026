import java.util.Scanner;

public class CharacterFrequencyUsingUnique {
    public static char[] findUniqueCharacters(String text) {
        char[] uniqueCharacters = new char[text.length()];
        int uniqueIndex = 0;

        for (int i = 0; i < text.length(); i++) {
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

    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueCharacters = findUniqueCharacters(text);
        String[][] result = new String[uniqueCharacters.length][2];

        for (int i = 0; i < uniqueCharacters.length; i++) {
            result[i][0] = String.valueOf(uniqueCharacters[i]);
            result[i][1] = String.valueOf(frequency[uniqueCharacters[i]]);
        }

        return result;
    }

    public static void displayFrequency(String[][] frequencyData) {
        System.out.println("Character\tFrequency");

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[][] frequencyData = findCharacterFrequency(text);
        displayFrequency(frequencyData);

        input.close();
    }
}
