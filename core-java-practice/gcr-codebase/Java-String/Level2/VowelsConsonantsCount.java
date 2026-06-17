import java.util.Scanner;

public class VowelsConsonantsCount {
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

    public static int[] countVowelsAndConsonants(String text) {
        int[] counts = new int[2];

        for (int i = 0; i < text.length(); i++) {
            String result = checkCharacter(text.charAt(i));

            if (result.equals("Vowel")) {
                counts[0]++;
            } else if (result.equals("Consonant")) {
                counts[1]++;
            }
        }

        return counts;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        int[] counts = countVowelsAndConsonants(text);

        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);

        input.close();
    }
}
