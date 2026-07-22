public class PeakElementFinder {
    public static int findPeakElementIndex(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean greaterThanLeft = mid == 0 || arr[mid] > arr[mid - 1];
            boolean greaterThanRight = mid == arr.length - 1 || arr[mid] > arr[mid + 1];
            if (greaterThanLeft && greaterThanRight) return mid;

            if (mid > 0 && arr[mid - 1] > arr[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
