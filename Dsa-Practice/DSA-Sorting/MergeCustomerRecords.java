class MergeCustomerRecords {
    public static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) result[k++] = first[i] <= second[j] ? first[i++] : second[j++];
        while (i < first.length) result[k++] = first[i++];
        while (j < second.length) result[k++] = second[j++];
        return result;
    }
}
