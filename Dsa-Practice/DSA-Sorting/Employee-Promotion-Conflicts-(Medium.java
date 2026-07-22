class EmployeePromotionConflictsMedium {
    public static long countConflicts(int[] scores) {
        if (scores == null) return 0;
        return sortAndCount(scores, 0, scores.length - 1, new int[scores.length]);
    }

    private static long sortAndCount(int[] a, int lo, int hi, int[] temp) {
        if (lo >= hi) return 0;
        int mid = lo + (hi - lo) / 2;
        long count = sortAndCount(a, lo, mid, temp) + sortAndCount(a, mid + 1, hi, temp);
        int i = lo, j = mid + 1, k = lo;
        while (i <= mid && j <= hi) {
            if (a[i] < a[j]) { count += mid - i + 1; temp[k++] = a[j++]; }
            else temp[k++] = a[i++];
        }
        while (i <= mid) temp[k++] = a[i++];
        while (j <= hi) temp[k++] = a[j++];
        System.arraycopy(temp, lo, a, lo, hi - lo + 1);
        return count;
    }
}
