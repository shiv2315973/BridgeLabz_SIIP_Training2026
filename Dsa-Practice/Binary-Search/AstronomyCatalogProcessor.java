public class AstronomyCatalogProcessor {
    public static int findMinimum(double[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int left = 0, right = arr.length - 1;
        if (arr[left] <= arr[right]) return left;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static int searchInRotatedCatalog(double[] arr, double target) {
        if (arr == null || arr.length == 0) return -1;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;

            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }

    public static int[] findFirstAndLastOccurrence(double[] arr, double target) {
        return new int[] {findBound(arr, target, true), findBound(arr, target, false)};
    }

    private static int findBound(double[] arr, double target, boolean lookForFirst) {
        int left = 0, right = arr.length - 1, resultIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                resultIndex = mid;
                if (lookForFirst) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return resultIndex;
    }
}
