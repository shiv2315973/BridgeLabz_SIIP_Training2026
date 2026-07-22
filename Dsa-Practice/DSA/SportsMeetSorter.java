public class SportsMeetSorter {
    public static class Athlete {
        String name; int score;
        public Athlete(String name, int score) { this.name = name; this.score = score; }
    }
    public static void bubbleSort(Athlete[] athletes) {
        for (int end = athletes.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) if (athletes[i].score < athletes[i + 1].score) { Athlete t = athletes[i]; athletes[i] = athletes[i + 1]; athletes[i + 1] = t; swapped = true; }
            if (!swapped) return;
        }
    }
    public static void insertionSort(Athlete[] athletes) {
        for (int i = 1; i < athletes.length; i++) {
            Athlete key = athletes[i]; int j = i - 1;
            while (j >= 0 && athletes[j].score < key.score) { athletes[j + 1] = athletes[j]; j--; }
            athletes[j + 1] = key;
        }
    }
}
