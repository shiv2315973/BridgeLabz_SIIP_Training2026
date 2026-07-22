public class BubbleSortPrices {
    public static void bubbleSort(long[] prices) {
        for (int end = prices.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) if (prices[i] > prices[i + 1]) { long t = prices[i]; prices[i] = prices[i + 1]; prices[i + 1] = t; swapped = true; }
            if (!swapped) return;
        }
    }
}
