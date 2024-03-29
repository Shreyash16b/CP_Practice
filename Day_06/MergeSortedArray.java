package CP_Practice.Day_06;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

    }

    public static void main(String[] args) {
        int[] a = { 4, 5, 6, 0, 0, 0 };
        int[] b = { 1, 2, 3 };
        merge(a, a.length - b.length, b, b.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
    }

}
