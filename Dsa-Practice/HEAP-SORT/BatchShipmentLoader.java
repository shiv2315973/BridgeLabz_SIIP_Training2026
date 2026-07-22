public class BatchShipmentLoader {
    public static void buildHeap(int[] priorities) {
        for (int i = priorities.length / 2 - 1; i >= 0; i--) siftDown(priorities, i, priorities.length);
    }
    private static void siftDown(int[] a, int parent, int size) {
        while (true) {
            int left = 2 * parent + 1, right = left + 1, smallest = parent;
            if (left < size && a[left] < a[smallest]) smallest = left;
            if (right < size && a[right] < a[smallest]) smallest = right;
            if (smallest == parent) return;
            int t = a[parent]; a[parent] = a[smallest]; a[smallest] = t; parent = smallest;
        }
    }
}
