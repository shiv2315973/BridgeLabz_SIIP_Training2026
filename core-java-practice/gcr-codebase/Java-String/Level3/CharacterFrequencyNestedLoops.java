import java.util.Scanner;

public class CharacterFrequencyNestedLoops {
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];
        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;
            }

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }

            uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] frequencyData = findCharacterFrequency(text);

        System.out.println("Character frequencies are:");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i]);
        }

        input.close();
    }
}
