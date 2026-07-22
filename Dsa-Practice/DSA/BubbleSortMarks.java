public class BubbleSortMarks {
    public static void bubbleSort(int[] marks) {
        for (int end = marks.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) if (marks[i] > marks[i + 1]) { int t = marks[i]; marks[i] = marks[i + 1]; marks[i + 1] = t; swapped = true; }
            if (!swapped) return;
        }
    }
}
