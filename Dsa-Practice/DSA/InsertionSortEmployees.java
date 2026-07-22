public class InsertionSortEmployees {
    public static void insertionSort(int[] employeeIds) {
        for (int i = 1; i < employeeIds.length; i++) {
            int key = employeeIds[i], j = i - 1;
            while (j >= 0 && employeeIds[j] > key) { employeeIds[j + 1] = employeeIds[j]; j--; }
            employeeIds[j + 1] = key;
        }
    }
}
