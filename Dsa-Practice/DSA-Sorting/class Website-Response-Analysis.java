class WebsiteResponseAnalysis {
    public static long countViolations(int[] responseTimes) {
        if (responseTimes == null) return 0;
        return count(responseTimes, 0, responseTimes.length - 1, new int[responseTimes.length]);
    }
    private static long count(int[] a, int lo, int hi, int[] temp) {
        if (lo >= hi) return 0;
        int mid = lo + (hi - lo) / 2; long result = count(a, lo, mid, temp) + count(a, mid + 1, hi, temp);
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) { if (a[i] <= a[j]) temp[k++] = a[i++]; else { result += mid - i + 1; temp[k++] = a[j++]; } }
        while (i <= mid) temp[k++] = a[i++]; while (j <= hi) temp[k++] = a[j++];
        System.arraycopy(temp, lo, a, lo, hi - lo + 1); return result;
    }
}
