import java.util.Scanner;

public class SplitWordsComparison {
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

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = -1;

        for (int i = 0; i <= length; i++) {
            if (i < length && text.charAt(i) != ' ' && start == -1) {
                start = i;
            }

            if ((i == length || text.charAt(i) == ' ') && start != -1) {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex] = word;
                wordIndex++;
                start = -1;
            }
        }

        return words;
    }

    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] userDefinedWords = splitWords(text);
        String[] builtInWords = text.trim().split("\\s+");
        boolean result = compareStringArrays(userDefinedWords, builtInWords);

        System.out.println("Words using user-defined method:");
        for (int i = 0; i < userDefinedWords.length; i++) {
            System.out.println(userDefinedWords[i]);
        }

        System.out.println("Both results are same: " + result);
        input.close();
    }
}
