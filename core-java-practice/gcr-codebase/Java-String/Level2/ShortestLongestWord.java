import java.util.Scanner;

public class ShortestLongestWord {
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

    public static int[] findShortestAndLongest(String[][] wordData) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordData.length; i++) {
            int currentLength = Integer.parseInt(wordData[i][1]);
            int shortestLength = Integer.parseInt(wordData[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordData[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        String[] words = splitWords(text);
        String[][] wordData = getWordsWithLength(words);
        int[] result = findShortestAndLongest(wordData);

        System.out.println("Shortest word: " + wordData[result[0]][0]);
        System.out.println("Longest word: " + wordData[result[1]][0]);

        input.close();
    }
}
