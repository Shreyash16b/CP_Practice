package CP_Practice.Day_08;

public class MedianOfSortdArray {
    public static void main(String[] args) {
        int[] a = { 1, 3 };
        int[] b = {};
        double m = findMedianSortedArrays(a, b);
        System.out.println(m);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a;
        int[] b;
        if (nums1.length > nums2.length) {
            a = nums2;
            b = nums1;
        } else {
            a = nums1;
            b = nums2;
        }
        int n1 = a.length, n2 = b.length;
        int total = a.length + b.length;
        int left = (total + 1) / 2;

        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;

            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (total % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }
        return 0;
    }
}
