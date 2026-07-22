public class FirstAndLastOccurrence {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, firstIdx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstIdx = mid;
                right = mid - 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return firstIdx;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, lastIdx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastIdx = mid;
                left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return lastIdx;
    }

    public static int[] searchRange(int[] arr, int target) {
        return new int[] {findFirstOccurrence(arr, target), findLastOccurrence(arr, target)};
    }
}
