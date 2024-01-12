package CP_Practice.Day_11;

public class PeakIndexInMountain {
    public static int peakIndexInMountainArray(int[] arr) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            System.out.println(mid);
            if (mid == 0 || mid == arr.length - 1) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                // System.out.println("C1");
                hi = mid;
            } else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                // System.out.println("C2");
                lo = mid;
            } else if (lo == hi) {
                return lo;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 5, 12, 2 };
        System.out.println(peakIndexInMountainArray(arr));
    }
}
