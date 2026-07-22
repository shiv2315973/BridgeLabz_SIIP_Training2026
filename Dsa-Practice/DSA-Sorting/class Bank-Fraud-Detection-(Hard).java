class BankFraudDetectionHard {
    public static long countSuspiciousPairs(int[] amounts) {
        if (amounts == null) return 0;
        return count(amounts, 0, amounts.length - 1, new int[amounts.length]);
    }
    private static long count(int[] a, int lo, int hi, int[] temp) {
        if (lo >= hi) return 0;
        int mid = lo + (hi - lo) / 2;
        long total = count(a, lo, mid, temp) + count(a, mid + 1, hi, temp);
        for (int i = lo, j = mid + 1; i <= mid; i++) { while (j <= hi && a[i] > 3L * a[j]) j++; total += j - mid - 1; }
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        while (i <= mid) temp[k++] = a[i++]; while (j <= hi) temp[k++] = a[j++];
        System.arraycopy(temp, lo, a, lo, hi - lo + 1); return total;
    }
}
