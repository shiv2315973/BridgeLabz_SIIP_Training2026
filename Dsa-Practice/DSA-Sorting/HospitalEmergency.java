class HospitalEmergency {
    public static int kthHighestPriority(int[] priorities, int k) {
        if (priorities == null || k < 1 || k > priorities.length) throw new IllegalArgumentException("Invalid k");
        return quickSelect(priorities, 0, priorities.length - 1, priorities.length - k);
    }

    private static int quickSelect(int[] a, int lo, int hi, int target) {
        while (lo <= hi) {
            int pivot = partition(a, lo, hi);
            if (pivot == target) return a[pivot];
            if (pivot < target) lo = pivot + 1; else hi = pivot - 1;
        }
        throw new IllegalStateException("No selection found");
    }

    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi], i = lo;
        for (int j = lo; j < hi; j++) if (a[j] <= pivot) { int t = a[i]; a[i++] = a[j]; a[j] = t; }
        int t = a[i]; a[i] = a[hi]; a[hi] = t;
        return i;
    }
}
