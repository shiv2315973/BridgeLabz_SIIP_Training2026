public class SelectionSortScores {
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < scores.length; j++) if (scores[j] < scores[minimum]) minimum = j;
            int t = scores[i]; scores[i] = scores[minimum]; scores[minimum] = t;
        }
    }
}
