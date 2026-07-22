import java.util.Arrays;

class LibrarySorter {
    public static void mergeSort(int[] a) {
        if (a == null || a.length < 2) return;
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid), right = Arrays.copyOfRange(a, mid, a.length);
        mergeSort(left); mergeSort(right);
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) a[k++] = left[i] <= right[j] ? left[i++] : right[j++];
        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }

    public static int[] countingSortGenres(int[] a, int min, int max) {
        int[] count = new int[max - min + 1], result = new int[a.length];
        for (int value : a) count[value - min]++;
        for (int i = 1; i < count.length; i++) count[i] += count[i - 1];
        for (int i = a.length - 1; i >= 0; i--) result[--count[a[i] - min]] = a[i];
        return result;
    }
}
