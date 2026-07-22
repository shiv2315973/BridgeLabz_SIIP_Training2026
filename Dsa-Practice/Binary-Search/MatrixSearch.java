public class MatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int columns = matrix[0].length;
        int left = 0, right = matrix.length * columns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = matrix[mid / columns][mid % columns];
            if (value == target) return true;
            if (target < value) right = mid - 1;
            else left = mid + 1;
        }
        return false;
    }
}
