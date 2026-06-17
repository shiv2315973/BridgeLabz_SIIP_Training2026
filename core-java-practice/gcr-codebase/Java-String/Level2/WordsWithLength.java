import java.util.Scanner;

public class WordsWithLength {
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

    public static String[][] getWordsWithLength(String[] words) {
        String[][] wordData = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];
            wordData[i][1] = String.valueOf(findLength(words[i]));
        }

        return wordData;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] words = splitWords(text);
        String[][] wordData = getWordsWithLength(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordData.length; i++) {
            int length = Integer.parseInt(wordData[i][1]);
            System.out.println(wordData[i][0] + "\t" + length);
        }

        input.close();
    }
}
