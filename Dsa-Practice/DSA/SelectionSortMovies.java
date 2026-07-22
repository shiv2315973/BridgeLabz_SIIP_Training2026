public class SelectionSortMovies {
    public static void selectionSort(int[] ratings) {
        for (int i = 0; i < ratings.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < ratings.length; j++) if (ratings[j] < ratings[minimum]) minimum = j;
            int t = ratings[i]; ratings[i] = ratings[minimum]; ratings[minimum] = t;
        }
    }
}
