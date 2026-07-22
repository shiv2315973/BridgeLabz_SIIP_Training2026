class QuickSortFlightTicketPrices {
    public static void sort(int[] prices) {
        if (prices != null) quickSort(prices, 0, prices.length - 1);
    }
    private static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int pivot = partition(a, lo, hi);
        quickSort(a, lo, pivot - 1); quickSort(a, pivot + 1, hi);
    }
    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi], i = lo;
        for (int j = lo; j < hi; j++) if (a[j] <= pivot) { int t = a[i]; a[i++] = a[j]; a[j] = t; }
        int t = a[i]; a[i] = a[hi]; a[hi] = t; return i;
    }
}
