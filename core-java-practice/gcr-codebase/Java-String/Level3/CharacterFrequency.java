import java.util.Scanner;

public class CharacterFrequency {
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 0) {
                uniqueCount++;
            }
            frequency[text.charAt(i)]++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        boolean[] added = new boolean[256];

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (!added[character]) {
                result[index][0] = String.valueOf(character);
                result[index][1] = String.valueOf(frequency[character]);
                added[character] = true;
                index++;
            }
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
