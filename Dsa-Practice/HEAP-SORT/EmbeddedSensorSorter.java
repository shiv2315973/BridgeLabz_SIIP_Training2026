public class EmbeddedSensorSorter {
    public static void heapSort(int[] readings) {
        for (int i = readings.length / 2 - 1; i >= 0; i--) siftDown(readings, i, readings.length);
        for (int end = readings.length - 1; end > 0; end--) { int t = readings[0]; readings[0] = readings[end]; readings[end] = t; siftDown(readings, 0, end); }
    }
    private static void siftDown(int[] a, int parent, int size) {
        while (true) {
            int left = 2 * parent + 1, right = left + 1, largest = parent;
            if (left < size && a[left] > a[largest]) largest = left;
            if (right < size && a[right] > a[largest]) largest = right;
            if (largest == parent) return;
            int t = a[parent]; a[parent] = a[largest]; a[largest] = t; parent = largest;
        }
    }
}
